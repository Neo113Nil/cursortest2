package b;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import W5.AbstractC0486a1;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.provider.Settings;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0751a implements InterfaceC1783c, q {

    /* renamed from: a, reason: collision with root package name */
    public s f9900a;

    /* renamed from: b, reason: collision with root package name */
    public Context f9901b;

    public static String a(BufferedInputStream bufferedInputStream) {
        if (!bufferedInputStream.markSupported()) {
            return null;
        }
        bufferedInputStream.mark(16);
        int read = bufferedInputStream.read();
        int read2 = bufferedInputStream.read();
        int read3 = bufferedInputStream.read();
        int read4 = bufferedInputStream.read();
        int read5 = bufferedInputStream.read();
        int read6 = bufferedInputStream.read();
        int read7 = bufferedInputStream.read();
        int read8 = bufferedInputStream.read();
        int read9 = bufferedInputStream.read();
        int read10 = bufferedInputStream.read();
        int read11 = bufferedInputStream.read();
        bufferedInputStream.reset();
        if (read == 46 && read2 == 115 && read3 == 110 && read4 == 100) {
            return "audio/basic";
        }
        if (read == 100 && read2 == 110 && read3 == 115 && read4 == 46) {
            return "audio/basic";
        }
        if (read == 82 && read2 == 73 && read3 == 70 && read4 == 70) {
            return "audio/x-wav";
        }
        if (read == 35 && read2 == 33 && read3 == 65 && read4 == 77 && read5 == 82) {
            return "audio/amr";
        }
        if (read == 102 && read2 == 116 && read3 == 121 && read4 == 112 && read5 == 105 && read6 == 115 && read7 == 111 && read8 == 109) {
            return "audio/mp4";
        }
        if (read == 0 && read2 == 0 && read3 == 0 && read4 == 32 && read5 == 102 && read6 == 116 && read7 == 121 && read8 == 112 && read9 == 77 && read10 == 52 && read11 == 65) {
            return "audio/mp4";
        }
        if (read == 77 && read2 == 54 && read3 == 68 && read4 == 64) {
            return "audio/midi";
        }
        if (read == 26 && read2 == 69 && read3 == 223 && read4 == 163) {
            return "audio/x-matroska";
        }
        if (read == 48 && read2 == 38 && read3 == 178 && read4 == 117 && read5 == 142 && read6 == 102 && read7 == 207 && read8 == 17) {
            return "audio/x-ms-wma";
        }
        if (read == 79 && read2 == 103 && read3 == 103 && read4 == 83) {
            return "audio/ogg";
        }
        if (read == 73 && read2 == 68 && read3 == 51) {
            return "audio/mpeg";
        }
        if (read != 255) {
            return null;
        }
        if (read2 == 251 || read2 == 243 || read2 == 242) {
            return "audio/mpeg";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:8|(4:9|10|11|(2:13|14)(1:80))|(9:(13:16|(6:52|53|54|55|56|(2:(2:59|(1:61)(1:63))(1:64)|62))|18|19|20|21|22|23|24|(1:26)|(1:28)|(1:30)|(2:32|33)(1:35))|21|22|23|24|(0)|(0)|(0)|(0)(0))|79|(0)|18|19|20) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(13:16|(6:52|53|54|55|56|(2:(2:59|(1:61)(1:63))(1:64)|62))|18|19|20|21|22|23|24|(1:26)|(1:28)|(1:30)|(2:32|33)(1:35))|21|22|23|24|(0)|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a A[Catch: Exception -> 0x012e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x012e, blocks: (B:20:0x00f9, B:26:0x012a, B:48:0x013b, B:47:0x0138, B:22:0x0103, B:24:0x010a, B:42:0x0132), top: B:19:0x00f9, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, String str2, boolean z4, boolean z7, boolean z8) {
        String str3;
        String str4;
        BufferedInputStream bufferedInputStream;
        OutputStream openOutputStream;
        String substring;
        if (!Settings.System.canWrite(this.f9901b)) {
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
            intent.setData(Uri.parse("package:" + this.f9901b.getPackageName()));
            intent.addFlags(268435456);
            this.f9901b.startActivity(intent);
        }
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            String absolutePath = file.getAbsolutePath();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", absolutePath);
            contentValues.put("title", "Custom ringtone");
            contentValues.put("_size", Long.valueOf(file.length()));
            contentValues.put("artist", "Ringtone app");
            contentValues.put("is_ringtone", Boolean.valueOf(z4));
            contentValues.put("is_notification", Boolean.valueOf(z7));
            contentValues.put("is_alarm", Boolean.valueOf(z8));
            contentValues.put("is_music", Boolean.FALSE);
            Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(absolutePath);
            this.f9901b.getContentResolver().delete(contentUriForPath, AbstractC0486a1.h("_data=\"", absolutePath, "\""), null);
            Uri insert = this.f9901b.getContentResolver().insert(contentUriForPath, contentValues);
            if (z7) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 2, insert);
            }
            if (z4) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 1, insert);
            }
            if (z8) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 4, insert);
                return;
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("title", "Custom ringtone");
        String absolutePath2 = file.getAbsolutePath();
        try {
            int lastIndexOf = absolutePath2.lastIndexOf(46);
            substring = lastIndexOf > 0 ? absolutePath2.substring(lastIndexOf + 1) : "";
        } catch (Exception unused) {
        }
        try {
            if (substring != "") {
                str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
                if (str3 == null) {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath2));
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    try {
                        str3 = a(bufferedInputStream);
                        bufferedInputStream.close();
                        if (str3 == null) {
                            if (str2 == null) {
                                str4 = "audio/mpeg";
                            } else if (str2 == "audio/wav") {
                                str4 = "audio/x-wav";
                            } else {
                                str3 = str2;
                            }
                            str3 = str4;
                        }
                    } finally {
                    }
                }
                contentValues2.put("mime_type", str3);
                contentValues2.put("_size", Long.valueOf(file.length()));
                contentValues2.put("artist", "Ringtone app");
                contentValues2.put("is_ringtone", Boolean.valueOf(z4));
                contentValues2.put("is_notification", Boolean.valueOf(z7));
                contentValues2.put("is_alarm", Boolean.valueOf(z8));
                contentValues2.put("is_music", Boolean.FALSE);
                Uri insert2 = this.f9901b.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues2);
                openOutputStream = this.f9901b.getContentResolver().openOutputStream(insert2);
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream2.read(bArr, 0, length);
                bufferedInputStream2.close();
                openOutputStream.write(bArr);
                openOutputStream.close();
                openOutputStream.flush();
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                if (z7) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 2, insert2);
                }
                if (z4) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 1, insert2);
                }
                if (z8) {
                    return;
                }
                RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 4, insert2);
                return;
            }
            int length2 = (int) file.length();
            byte[] bArr2 = new byte[length2];
            BufferedInputStream bufferedInputStream22 = new BufferedInputStream(new FileInputStream(file));
            bufferedInputStream22.read(bArr2, 0, length2);
            bufferedInputStream22.close();
            openOutputStream.write(bArr2);
            openOutputStream.close();
            openOutputStream.flush();
            if (openOutputStream != null) {
            }
            if (z7) {
            }
            if (z4) {
            }
            if (z8) {
            }
        } finally {
        }
        str3 = null;
        if (str3 == null) {
        }
        contentValues2.put("mime_type", str3);
        contentValues2.put("_size", Long.valueOf(file.length()));
        contentValues2.put("artist", "Ringtone app");
        contentValues2.put("is_ringtone", Boolean.valueOf(z4));
        contentValues2.put("is_notification", Boolean.valueOf(z7));
        contentValues2.put("is_alarm", Boolean.valueOf(z8));
        contentValues2.put("is_music", Boolean.FALSE);
        Uri insert22 = this.f9901b.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues2);
        openOutputStream = this.f9901b.getContentResolver().openOutputStream(insert22);
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        Context context = c1782b.f18075a;
        if (this.f9900a != null) {
            return;
        }
        this.f9901b = context;
        s sVar = new s(c1782b.f18077c, "ringtone_set");
        this.f9900a = sVar;
        sVar.b(this);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f9900a.b(null);
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        if (oVar.f676a.equals("getPlatformVersion")) {
            ((p) rVar).success("Android " + Build.VERSION.RELEASE);
            return;
        }
        String str = oVar.f676a;
        if (str.equals("getPlatformSdk")) {
            ((p) rVar).success(Integer.valueOf(Build.VERSION.SDK_INT));
            return;
        }
        if (str.equals("setRingtone")) {
            b((String) oVar.a("path"), (String) oVar.a("mimeType"), true, false, false);
            ((p) rVar).success(Boolean.TRUE);
            return;
        }
        if (str.equals("setNotification")) {
            b((String) oVar.a("path"), (String) oVar.a("mimeType"), false, true, false);
            ((p) rVar).success(Boolean.TRUE);
        } else if (str.equals("setAlarm")) {
            b((String) oVar.a("path"), (String) oVar.a("mimeType"), false, false, true);
            ((p) rVar).success(Boolean.TRUE);
        } else if (!str.equals("isWriteGranted")) {
            ((p) rVar).notImplemented();
        } else {
            ((p) rVar).success(Boolean.valueOf(Settings.System.canWrite(this.f9901b)));
        }
    }
}
