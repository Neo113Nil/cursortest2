package p009b;

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
import java.io.IOException;
import java.io.OutputStream;
import p159w5.b;
import p159w5.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements c, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f9900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f9901b;

    public static String a(BufferedInputStream bufferedInputStream) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            return null;
        }
        bufferedInputStream.mark(16);
        int i7 = bufferedInputStream.read();
        int i8 = bufferedInputStream.read();
        int i9 = bufferedInputStream.read();
        int i10 = bufferedInputStream.read();
        int i11 = bufferedInputStream.read();
        int i12 = bufferedInputStream.read();
        int i13 = bufferedInputStream.read();
        int i14 = bufferedInputStream.read();
        int i15 = bufferedInputStream.read();
        int i16 = bufferedInputStream.read();
        int i17 = bufferedInputStream.read();
        bufferedInputStream.reset();
        if (i7 == 46 && i8 == 115 && i9 == 110 && i10 == 100) {
            return "audio/basic";
        }
        if (i7 == 100 && i8 == 110 && i9 == 115 && i10 == 46) {
            return "audio/basic";
        }
        if (i7 == 82 && i8 == 73 && i9 == 70 && i10 == 70) {
            return "audio/x-wav";
        }
        if (i7 == 35 && i8 == 33 && i9 == 65 && i10 == 77 && i11 == 82) {
            return "audio/amr";
        }
        if (i7 == 102 && i8 == 116 && i9 == 121 && i10 == 112 && i11 == 105 && i12 == 115 && i13 == 111 && i14 == 109) {
            return "audio/mp4";
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 32 && i11 == 102 && i12 == 116 && i13 == 121 && i14 == 112 && i15 == 77 && i16 == 52 && i17 == 65) {
            return "audio/mp4";
        }
        if (i7 == 77 && i8 == 54 && i9 == 68 && i10 == 64) {
            return "audio/midi";
        }
        if (i7 == 26 && i8 == 69 && i9 == 223 && i10 == 163) {
            return "audio/x-matroska";
        }
        if (i7 == 48 && i8 == 38 && i9 == 178 && i10 == 117 && i11 == 142 && i12 == 102 && i13 == 207 && i14 == 17) {
            return "audio/x-ms-wma";
        }
        if (i7 == 79 && i8 == 103 && i9 == 103 && i10 == 83) {
            return "audio/ogg";
        }
        if (i7 == 73 && i8 == 68 && i9 == 51) {
            return "audio/mpeg";
        }
        if (i7 != 255) {
            return null;
        }
        if (i8 == 251 || i8 == 243 || i8 == 242) {
            return "audio/mpeg";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final void b(String str, String str2, boolean z4, boolean z7, boolean z8) {
        String mimeTypeFromExtension;
        String str3;
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
            Uri uriInsert = this.f9901b.getContentResolver().insert(contentUriForPath, contentValues);
            if (z7) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 2, uriInsert);
            }
            if (z4) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 1, uriInsert);
            }
            if (z8) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 4, uriInsert);
                return;
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("title", "Custom ringtone");
        String absolutePath2 = file.getAbsolutePath();
        try {
            int iLastIndexOf = absolutePath2.lastIndexOf(46);
            String strSubstring = iLastIndexOf > 0 ? absolutePath2.substring(iLastIndexOf + 1) : "";
            mimeTypeFromExtension = strSubstring != "" ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring) : null;
        } catch (Exception unused) {
        }
        if (mimeTypeFromExtension == null) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath2));
                try {
                    mimeTypeFromExtension = a(bufferedInputStream);
                    bufferedInputStream.close();
                    if (mimeTypeFromExtension == null) {
                        if (str2 == null) {
                            str3 = "audio/mpeg";
                        } else if (str2 == "audio/wav") {
                            str3 = "audio/x-wav";
                        } else {
                            mimeTypeFromExtension = str2;
                        }
                        mimeTypeFromExtension = str3;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        contentValues2.put("mime_type", mimeTypeFromExtension);
        contentValues2.put("_size", Long.valueOf(file.length()));
        contentValues2.put("artist", "Ringtone app");
        contentValues2.put("is_ringtone", Boolean.valueOf(z4));
        contentValues2.put("is_notification", Boolean.valueOf(z7));
        contentValues2.put("is_alarm", Boolean.valueOf(z8));
        contentValues2.put("is_music", Boolean.FALSE);
        Uri uriInsert2 = this.f9901b.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues2);
        try {
            OutputStream outputStreamOpenOutputStream = this.f9901b.getContentResolver().openOutputStream(uriInsert2);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    bufferedInputStream2.read(bArr, 0, length);
                    bufferedInputStream2.close();
                    outputStreamOpenOutputStream.write(bArr);
                    outputStreamOpenOutputStream.close();
                    outputStreamOpenOutputStream.flush();
                } catch (IOException unused2) {
                }
                if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.close();
                }
                if (z7) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 2, uriInsert2);
                }
                if (z4) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 1, uriInsert2);
                }
                if (z8) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 4, uriInsert2);
                }
            } catch (Throwable th3) {
                if (outputStreamOpenOutputStream == null) {
                    throw th3;
                }
                try {
                    outputStreamOpenOutputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
                if (z7) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 2, uriInsert2);
                }
                if (z4) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 1, uriInsert2);
                }
                if (z8) {
                    RingtoneManager.setActualDefaultRingtoneUri(this.f9901b, 4, uriInsert2);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        Context context = bVar.f18081a;
        if (this.f9900a != null) {
            return;
        }
        this.f9901b = context;
        s sVar = new s(bVar.f18083c, "ringtone_set");
        this.f9900a = sVar;
        sVar.b(this);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
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
