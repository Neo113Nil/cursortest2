package w1;

import android.content.Context;
import android.text.TextUtils;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.google.firebase.messaging.RemoteMessage;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.SentryThread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: w1.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1741r1 {
    public static FlurryMessage a(RemoteMessage remoteMessage) {
        if (!AbstractC1739q1.f(remoteMessage)) {
            return null;
        }
        FlurryMessage.Builder ttl = new FlurryMessage.Builder().setFrom(remoteMessage.getFrom()).setSentTime(remoteMessage.getSentTime()).setTtl(remoteMessage.getTtl());
        Map data = remoteMessage.getData();
        ttl.setTitle((String) data.get("title")).setBody((String) data.get(SentryLogEvent.JsonKeys.BODY)).setColor((String) data.get("color")).setSound((String) data.get("sound"));
        HashMap<String, String> c3 = c((String) data.get("appData"));
        String str = (String) data.get("fl.Data");
        HashMap<String, String> c4 = c(str);
        c3.put("fl.Data", str);
        ttl.setNotificationId(new SecureRandom().nextInt(100)).setAppData(c3).setFlurryData(c4).setIcon((String) data.get("icon")).setClickAction((String) data.get("click_action")).setPriority((String) data.get(SentryThread.JsonKeys.PRIORITY));
        return ttl.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: IOException -> 0x0030, TRY_ENTER, TryCatch #5 {IOException -> 0x0030, blocks: (B:16:0x002c, B:17:0x0032, B:26:0x005f, B:28:0x0064), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: IOException -> 0x0030, TRY_LEAVE, TryCatch #5 {IOException -> 0x0030, blocks: (B:16:0x002c, B:17:0x0032, B:26:0x005f, B:28:0x0064), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject b(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStream;
        StringBuilder sb;
        try {
            try {
                inputStream = context.getApplicationContext().getAssets().open("flurryNotificationConfig.json");
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } catch (IOException unused) {
            inputStream = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
            inputStream = null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                try {
                    sb = new StringBuilder();
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        } catch (IOException unused2) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (sb == 0) {
                            }
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    bufferedReader.close();
                } catch (IOException unused3) {
                    sb = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        throw th;
                    }
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (IOException unused4) {
            bufferedReader = null;
            sb = bufferedReader;
            if (inputStream != null) {
            }
            if (bufferedReader != null) {
            }
            if (sb == 0) {
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        if (sb == 0) {
            return null;
        }
        return new JSONObject(sb.toString());
    }

    public static HashMap c(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
        return hashMap;
    }
}
