package p155w1;

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

/* JADX INFO: renamed from: w1.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1032r1 {
    public static FlurryMessage a(RemoteMessage remoteMessage) {
        if (!AbstractC1030q1.f(remoteMessage)) {
            return null;
        }
        FlurryMessage.Builder ttl = new FlurryMessage.Builder().setFrom(remoteMessage.getFrom()).setSentTime(remoteMessage.getSentTime()).setTtl(remoteMessage.getTtl());
        Map data = remoteMessage.getData();
        ttl.setTitle((String) data.get("title")).setBody((String) data.get(SentryLogEvent.JsonKeys.BODY)).setColor((String) data.get("color")).setSound((String) data.get("sound"));
        HashMap<String, String> mapC = c((String) data.get("appData"));
        String str = (String) data.get("fl.Data");
        HashMap<String, String> mapC2 = c(str);
        mapC.put("fl.Data", str);
        ttl.setNotificationId(new SecureRandom().nextInt(100)).setAppData(mapC).setFlurryData(mapC2).setIcon((String) data.get("icon")).setClickAction((String) data.get("click_action")).setPriority((String) data.get(SentryThread.JsonKeys.PRIORITY));
        return ttl.build();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[Catch: IOException -> 0x004e, TRY_LEAVE, TryCatch #8 {IOException -> 0x004e, blocks: (B:27:0x004a, B:31:0x0052), top: B:50:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x005f A[Catch: IOException -> 0x0030, TRY_ENTER, TryCatch #5 {IOException -> 0x0030, blocks: (B:13:0x002c, B:16:0x0032, B:37:0x005f, B:39:0x0064), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0064 A[Catch: IOException -> 0x0030, TRY_LEAVE, TryCatch #5 {IOException -> 0x0030, blocks: (B:13:0x002c, B:16:0x0032, B:37:0x005f, B:39:0x0064), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject b(Context context) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStreamOpen;
        StringBuilder sb;
        try {
            try {
                inputStreamOpen = context.getApplicationContext().getAssets().open("flurryNotificationConfig.json");
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                    try {
                        try {
                            sb = new StringBuilder();
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    sb.append(line);
                                } catch (IOException unused) {
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                }
                            }
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            bufferedReader.close();
                        } catch (IOException unused2) {
                            sb = 0;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                throw th;
                            }
                        } else if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                    sb = bufferedReader;
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (sb == 0) {
                        return null;
                    }
                    return new JSONObject(sb.toString());
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        } catch (IOException unused4) {
            inputStreamOpen = null;
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            inputStreamOpen = null;
        }
        if (sb == 0) {
            return null;
        }
        return new JSONObject(sb.toString());
    }

    public static HashMap c(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
        return map;
    }
}
