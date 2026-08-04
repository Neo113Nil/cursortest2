package p155w1;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f17325a = Charset.forName("UTF-8");

    public static synchronized void a(Context context, String str) {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = context.openFileOutput(f(context), 0);
                fileOutputStreamOpenFileOutput.write(str.getBytes());
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (IOException e7) {
                AbstractC0997i0.r("Error in writing data to file", e7);
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (Throwable th) {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static boolean b(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || (str4 = (String) E0.f17365a.get(str)) == null) {
            return false;
        }
        return str.indexOf("com.flurry.configkey.prod.ec.") != -1 ? c(str4, str2, str3, "EC", "SHA256withECDSA") : c(str4, str2, str3, "RSA", "SHA256withRSA");
    }

    public static boolean c(String str, String str2, String str3, String str4, String str5) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str4).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            Signature signature = Signature.getInstance(str5);
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(str2.getBytes(f17325a));
            return signature.verify(Base64.decode(str3, 0));
        } catch (GeneralSecurityException e7) {
            AbstractC0997i0.q("GeneralSecurityException for Signature: ".concat(String.valueOf(e7)));
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static synchronized String d(Context context) {
        FileInputStream fileInputStreamOpenFileInput;
        try {
            try {
                if (context == 0) {
                    return null;
                }
                try {
                    fileInputStreamOpenFileInput = context.openFileInput(f(context));
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStreamOpenFileInput));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                        return sb.toString();
                    } catch (FileNotFoundException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return null;
                    } catch (IOException e7) {
                        e = e7;
                        AbstractC0997i0.r("Error in reading file!", e);
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused4) {
                            }
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused5) {
                    fileInputStreamOpenFileInput = null;
                } catch (IOException e8) {
                    e = e8;
                    fileInputStreamOpenFileInput = null;
                } catch (Throwable th) {
                    th = th;
                    context = 0;
                    if (context != 0) {
                        try {
                            context.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static synchronized void e(Context context) {
        if (context == null) {
            return;
        }
        context.deleteFile(f(context));
    }

    public static String f(Context context) {
        return context.getPackageName() + ".variants";
    }
}
