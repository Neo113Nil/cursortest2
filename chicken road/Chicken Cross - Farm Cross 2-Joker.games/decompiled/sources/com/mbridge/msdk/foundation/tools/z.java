package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DynamicViewResourceManager.java */
/* loaded from: classes6.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    static final List<String> f9446a;

    /* compiled from: DynamicViewResourceManager.java */
    class a implements OnDownloadStateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9447a;
        final /* synthetic */ String b;
        final /* synthetic */ c c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        a(String str, String str2, c cVar, String str3, String str4) {
            this.f9447a = str;
            this.b = str2;
            this.c = cVar;
            this.d = str3;
            this.e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                String str2 = this.f9447a + File.separator + this.b;
                String str3 = this.f9447a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.c == null) {
                    return;
                }
                try {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th) {
                            q0.b("DynamicViewResourceManager", th.getMessage());
                        }
                        this.c.a(this.d, str3, this.e, str, false);
                        return;
                    }
                    this.c.a(this.d, str3, this.e, str, false);
                    return;
                } catch (Exception e) {
                    q0.b("DynamicViewResourceManager", e.getMessage());
                    return;
                }
                str = "";
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.c;
            if (cVar != null) {
                try {
                    cVar.a(this.d, downloadError);
                } catch (Exception e) {
                    q0.b("DynamicViewResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* compiled from: DynamicViewResourceManager.java */
    class b implements OnDownloadStateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9448a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.f9448a = str;
            this.b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                MBResourceManager.getInstance().unZip(this.f9448a + File.separator + this.b, this.f9448a);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* compiled from: DynamicViewResourceManager.java */
    public interface c {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f9446a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:(2:5|6)|7|(2:8|9)|(4:(17:11|(1:65)|15|16|(7:18|19|20|(2:(1:(1:24)(2:55|56))|59)(1:60)|57|26|(5:44|45|46|47|48)(1:(6:31|32|33|34|35|36)(1:43)))|63|19|20|(0)(0)|57|26|(1:28)|44|45|46|47|48)|46|47|48)|67|(1:13)|65|15|16|(0)|63|19|20|(0)(0)|57|26|(0)|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:(2:5|6)|7|8|9|(17:11|(1:65)|15|16|(7:18|19|20|(2:(1:(1:24)(2:55|56))|59)(1:60)|57|26|(5:44|45|46|47|48)(1:(6:31|32|33|34|35|36)(1:43)))|63|19|20|(0)(0)|57|26|(1:28)|44|45|46|47|48)|67|(1:13)|65|15|16|(0)|63|19|20|(0)(0)|57|26|(0)|44|45|46|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r14 != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("DynamicViewResourceManager", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:16:0x0065, B:18:0x006b), top: B:15:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1 A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #4 {Exception -> 0x00a8, blocks: (B:56:0x0091, B:59:0x0099, B:60:0x00a1), top: B:20:0x0086 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(int i, String str, String str2, c cVar, CampaignEx campaignEx) {
        String str3;
        File file;
        String str4;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            str3 = b(i, str, str2);
        } catch (Exception unused) {
            str3 = "";
        }
        String str5 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        try {
            if (!TextUtils.isEmpty(str3)) {
                file = new File(str5, str3);
                if (file != null || !file.exists()) {
                    file = new File(str5 + File.separator + str3.replace(".xml", ""), str3);
                }
                if (file.exists()) {
                    str4 = file.getPath();
                    eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("scenes", "1");
                    eVar.a("url", str2);
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                eVar.a("resource_type", 3);
                            }
                        }
                        eVar.a("resource_type", 2);
                    } else {
                        eVar.a("resource_type", 1);
                    }
                    if (!TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        String path = new URL(str2).getPath();
                        String substring = path.substring(path.lastIndexOf(47) + 1);
                        a(str2, substring, str5, substring.replace(".zip", ""), cVar, campaignEx, i);
                        eVar.a("cache", 2);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
                        return;
                    }
                    if (cVar != null) {
                        try {
                            cVar.a(str2, str4, str3, null, true);
                        } catch (Exception e) {
                            q0.b("DynamicViewResourceManager", e.getMessage());
                        }
                        try {
                            eVar.a("cache", 1);
                            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    return;
                }
                str4 = "";
                eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("scenes", "1");
                eVar.a("url", str2);
                if (i != 0) {
                }
                if (TextUtils.isEmpty(str4)) {
                }
                String path2 = new URL(str2).getPath();
                String substring2 = path2.substring(path2.lastIndexOf(47) + 1);
                a(str2, substring2, str5, substring2.replace(".zip", ""), cVar, campaignEx, i);
                eVar.a("cache", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
                return;
            }
            eVar.a("cache", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            return;
        } catch (Exception unused3) {
            return;
        }
        file = null;
        if (file != null) {
        }
        file = new File(str5 + File.separator + str3.replace(".xml", ""), str3);
        if (file.exists()) {
        }
        str4 = "";
        eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("scenes", "1");
        eVar.a("url", str2);
        if (i != 0) {
        }
        if (TextUtils.isEmpty(str4)) {
        }
        String path22 = new URL(str2).getPath();
        String substring22 = path22.substring(path22.lastIndexOf(47) + 1);
        a(str2, substring22, str5, substring22.replace(".zip", ""), cVar, campaignEx, i);
    }

    private static String b(int i, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            String path = new URL(str2).getPath();
            String substring = path.substring(path.lastIndexOf(47) + 1);
            return !TextUtils.isEmpty(substring) ? substring.replace(".zip", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            String substring = path.substring(path.lastIndexOf(47) + 1);
            if (TextUtils.isEmpty(substring)) {
                return "";
            }
            String replace = substring.replace(".zip", "");
            List<String> list = f9446a;
            return list != null ? !list.contains(replace) ? replace : "" : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(int i, String str, String str2) {
        String str3;
        File file;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            str3 = b(i, str, str2);
        } catch (Exception unused) {
            str3 = "";
        }
        String str4 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        if (!TextUtils.isEmpty(str3)) {
            file = new File(str4, str3);
            if (file != null || !file.exists()) {
                file = new File(str4 + File.separator + str3.replace(".xml", ""), str3);
            }
            return file.getPath();
        }
        file = null;
        if (file != null) {
        }
        file = new File(str4 + File.separator + str3.replace(".xml", ""), str3);
        return file.getPath();
    }

    public static String a(String str) {
        String str2;
        String str3;
        File file;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!queryParameter.equals("1")) {
                    return "";
                }
            }
        } catch (Throwable unused) {
        }
        try {
            str2 = b(str);
        } catch (Exception unused2) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            str3 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
            file = new File(str3, str2);
        } catch (Exception unused3) {
        }
        if (file.isFile() && file.exists()) {
            return file.getPath();
        }
        String path = new URL(str).getPath();
        a(str, path.substring(path.lastIndexOf(47) + 1), str3, str2);
        return "";
    }

    private static final void a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i) throws Exception {
        q0.a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.t).withTimeout(60000L).withWriteTimeout(com.mbridge.msdk.foundation.same.a.s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    private static final void a(String str, String str2, String str3, String str4) throws Exception {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.s).withTimeout(60000L).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
