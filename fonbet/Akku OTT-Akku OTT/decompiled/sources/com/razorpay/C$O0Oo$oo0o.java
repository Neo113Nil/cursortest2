package com.razorpay;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.exoplayer.video.w;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.razorpay.$O0Oo$oo0o, reason: invalid class name */
/* loaded from: classes4.dex */
public class C$O0Oo$oo0o {
    private static C$O0Oo$oo0o instance;
    public String buildNumber;
    public String checkoutPublicUrl;
    private Context context;
    public String publicPageResponse;
    public boolean areAllFilesDownloaded = false;
    public boolean isCachingDisabled = false;
    private boolean shouldClearCache = false;
    public boolean isFetchedPublicPageUsed = false;
    public HashMap<String, String> files = new HashMap<>();
    private HashMap<String, String> fileLocations = new HashMap<>();
    Map<String, Object> props = new HashMap();

    private C$O0Oo$oo0o() {
    }

    private void clearCacheFilesWhenActivityIsAvailable() {
        this.isCachingDisabled = true;
        this.shouldClearCache = true;
        if (this.context != null) {
            deleteRecursive(new File(this.context.getFilesDir() + "/razorpay"));
            reset();
        }
    }

    private void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    private boolean doesBuildNumberExist(String str) {
        if (this.context == null) {
            return false;
        }
        return new File(this.context.getFilesDir() + "/razorpay/" + str).exists();
    }

    public static C$O0Oo$oo0o getInstance() {
        if (instance == null) {
            instance = new C$O0Oo$oo0o();
        }
        return instance;
    }

    private boolean isErrorOrIsCachingDisabled(@NonNull ResponseObject responseObject) {
        if (responseObject.getResponseCode() > 400) {
            if (responseObject.getResponseCode() == 404) {
                clearCacheFilesWhenActivityIsAvailable();
            }
            return true;
        }
        try {
            if (new JSONObject(responseObject.getResponseResult()).getBoolean("enabled")) {
                return false;
            }
            clearCacheFilesWhenActivityIsAvailable();
            return true;
        } catch (Exception unused) {
            clearCacheFilesWhenActivityIsAvailable();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPrefetch$1(Context context) {
        this.context = context;
        startPrefetch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPrefetch$2(ResponseObject responseObject) {
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_PUBLIC_PAGE_DOWNLOAD_COMPLETE, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        if (responseObject.getResponseCode() <= 400) {
            this.publicPageResponse = responseObject.getResponseResult();
        } else {
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_PUBLIC_PAGE_DOWNLOAD_FAILED, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            this.isCachingDisabled = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPrefetch$3(String str, int i, JSONArray jSONArray, ResponseObject responseObject) {
        if (responseObject.getResponseResult() == null) {
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_DOWNLOAD_INTERRUPTED, "filename", str);
            return;
        }
        try {
            Logger.d(responseObject.getResponseResult());
            this.files.put(str.substring(str.lastIndexOf(DomExceptionUtils.SEPARATOR) + 1), responseObject.getResponseResult());
            Logger.d(str);
            if (i == jSONArray.length() - 1) {
                Logger.d("LOAD_TIME all files are downloaded " + System.currentTimeMillis());
                trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_DOWNLOAD_END, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                this.areAllFilesDownloaded = true;
                Context context = this.context;
                if (context != null) {
                    saveFilesToCache(context);
                }
            }
        } catch (Exception unused) {
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_DECOMPRESS_FAILED, "filename", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPrefetch$4(ResponseObject responseObject) {
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_FILE_DOWNLOADED, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        if (isErrorOrIsCachingDisabled(responseObject)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(responseObject.getResponseResult());
            this.buildNumber = jSONObject.getString("build");
            final JSONArray jSONArray = jSONObject.getJSONArray("files");
            String optString = jSONObject.optString("traffic_env");
            this.checkoutPublicUrl = "https://api.razorpay.com/v1/checkout/public?platform=android&version=1.7.17&library=checkoutjs&build=" + this.buildNumber;
            if (!optString.isEmpty()) {
                this.checkoutPublicUrl += "&traffic_env=" + optString;
            }
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_PUBLIC_PAGE_DOWNLOAD_START, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            Owl.get(this.checkoutPublicUrl, new Callback() { // from class: com.razorpay.a
                @Override // com.razorpay.Callback
                public final void run(ResponseObject responseObject2) {
                    C$O0Oo$oo0o.this.lambda$startPrefetch$2(responseObject2);
                }
            });
            if (doesBuildNumberExist(this.buildNumber)) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_BUILD_EXISTS);
                File file = new File(this.context.getFilesDir() + "/razorpay/" + this.buildNumber);
                for (int i = 0; i < jSONArray.length(); i++) {
                    Logger.d("build number exists");
                    String string = jSONArray.getString(i);
                    String substring = string.substring(string.lastIndexOf(DomExceptionUtils.SEPARATOR) + 1);
                    String fileIfBuildExists = getFileIfBuildExists(substring);
                    if (fileIfBuildExists != null && !fileIfBuildExists.isEmpty()) {
                        this.files.put(substring, fileIfBuildExists);
                        Logger.d(this.files.toString());
                    }
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_BUILD_EXISTS_FILE_ERROR);
                    deleteRecursive(file);
                    Logger.d("File data is empty or null for file " + substring);
                    startPrefetch();
                }
                if (this.files != null) {
                    trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_BUILD_LOCAL_ASSETS_LOADED, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                    return;
                }
            }
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_DOWNLOAD_START, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            for (final int i2 = 0; i2 < jSONArray.length(); i2++) {
                Logger.d("FileName: " + jSONArray.getString(i2));
                final String string2 = jSONArray.getString(i2);
                HashMap hashMap = new HashMap();
                hashMap.put("accept-encoding", "gzip");
                Owl.get(string2, hashMap, new Callback() { // from class: com.razorpay.b
                    @Override // com.razorpay.Callback
                    public final void run(ResponseObject responseObject2) {
                        C$O0Oo$oo0o.this.lambda$startPrefetch$3(string2, i2, jSONArray, responseObject2);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPrefetchForPublicPage$0(ResponseObject responseObject) {
        if (responseObject.getResponseCode() > 400) {
            this.isCachingDisabled = true;
        } else {
            this.publicPageResponse = responseObject.getResponseResult();
        }
    }

    private void trackEvent(AnalyticsEvent analyticsEvent, String str, Object obj) {
        this.props.clear();
        this.props.put(str, obj);
        AnalyticsUtil.trackEvent(analyticsEvent, this.props);
    }

    public String getFileIfBuildExists(String str) {
        if (this.isCachingDisabled) {
            return "";
        }
        if (this.files.get(str) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("filename", str);
            hashMap.put(Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_LOCAL_ASSET_FILE_LOADED, hashMap);
            Logger.d("file " + str + " found in fileSet: loading from cache");
            return this.files.get(str);
        }
        File file = new File(this.context.getFilesDir() + "/razorpay/");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles.length > 0) {
                String str2 = listFiles[0].getPath() + DomExceptionUtils.SEPARATOR + str;
                File file2 = new File(str2);
                if (file2.exists()) {
                    Logger.d("checkFileName:" + str2);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                String sb2 = sb.toString();
                                Logger.d("fileContents for " + str + ": \n" + sb2);
                                return sb2;
                            }
                            sb.append(readLine);
                        }
                    } catch (IOException e) {
                        Logger.e("fileNotFoundException : " + e.getLocalizedMessage());
                        Logger.d("fileContents for " + str + ": \n");
                        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_LOCAL_ASSET_FILE_LOADED, this.props);
                        return "";
                    }
                } else {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_LOCAL_ASSET_FILE_LOAD_FAILED, this.props);
                }
            }
        }
        return "";
    }

    public void reset() {
        this.areAllFilesDownloaded = false;
        this.shouldClearCache = false;
        this.buildNumber = null;
        this.publicPageResponse = null;
        this.files = new HashMap<>();
        this.checkoutPublicUrl = null;
        this.publicPageResponse = null;
        this.isFetchedPublicPageUsed = false;
    }

    public void saveFilesToCache(Context context) {
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_STORING_START, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        Logger.d("LOAD_TIME saveFilesToCache with context: " + System.currentTimeMillis());
        this.context = context;
        if (this.isCachingDisabled) {
            if (this.shouldClearCache) {
                deleteRecursive(new File(context.getFilesDir() + "/razorpay"));
                reset();
                return;
            }
            return;
        }
        String str = context.getFilesDir() + "/razorpay/";
        String str2 = context.getFilesDir() + "/razorpay/" + this.buildNumber;
        File file = new File(str2);
        if (!file.exists() && this.areAllFilesDownloaded) {
            File file2 = new File(str);
            File[] listFiles = file2.listFiles();
            if (listFiles != null && listFiles.length >= 3) {
                deleteRecursive(file2);
            }
            file.mkdirs();
            for (Map.Entry<String, String> entry : this.files.entrySet()) {
                if (entry.getValue() == null || entry.getValue().isEmpty()) {
                    deleteRecursive(file2);
                    return;
                }
                if (entry.getValue() == null) {
                    return;
                }
                HashMap<String, String> hashMap = this.fileLocations;
                String key = entry.getKey();
                StringBuilder d = androidx.browser.browseractions.a.d(str2, DomExceptionUtils.SEPARATOR);
                d.append(entry.getKey());
                hashMap.put(key, d.toString());
                try {
                    File file3 = new File(str2 + DomExceptionUtils.SEPARATOR + entry.getKey());
                    file3.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    fileOutputStream.write(entry.getValue().getBytes());
                    fileOutputStream.close();
                } catch (Exception unused) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("filename", entry.getKey());
                    hashMap2.put(Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_STORING_FAILED, hashMap2);
                }
            }
            trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_ASSET_FILES_STORING_END, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public void startPrefetch(Context context) {
        Executors.newSingleThreadExecutor().execute(new w(2, this, context));
    }

    public void startPrefetchForPublicPage() {
        this.checkoutPublicUrl = "https://api.razorpay.com/v1/checkout/public?platform=android&version=1.7.17&library=checkoutjs";
        Owl.get("https://api.razorpay.com/v1/checkout/public?platform=android&version=1.7.17&library=checkoutjs", new Callback() { // from class: com.razorpay.c
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                C$O0Oo$oo0o.this.lambda$startPrefetchForPublicPage$0(responseObject);
            }
        });
    }

    public void startPrefetch() {
        Logger.d("LOAD_TIME Merchant initialized checkout: " + System.currentTimeMillis());
        trackEvent(AnalyticsEvent.CHECKOUT_PREFETCH_STARTED, Constants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        Owl.get("https://checkout.razorpay.com/v1/prefetch.json", new Callback() { // from class: com.razorpay.d
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                C$O0Oo$oo0o.this.lambda$startPrefetch$4(responseObject);
            }
        });
    }
}
