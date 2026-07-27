package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

/* compiled from: OperatorFile.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f8932a;

    public j(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f8932a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, Object obj2) {
        try {
            if (com.mbridge.msdk.config.component.common.util.c.c("870").equals(str)) {
                return a(obj2);
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("901").equals(str)) {
                return b(obj2);
            }
            File file = new File(String.valueOf(obj));
            if (!file.exists()) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            if (!com.mbridge.msdk.config.component.common.util.c.c("871").equals(str) && !com.mbridge.msdk.config.component.common.util.c.c("872").equals(str)) {
                if (com.mbridge.msdk.config.component.common.util.c.c("873").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.length()));
                }
                if (com.mbridge.msdk.config.component.common.util.c.c("874").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(file));
                }
                q0.b("OperatorFile", "Unknown file operation: " + str);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.lastModified()));
        } catch (Exception e) {
            q0.b("OperatorFile", "Error handling file operation: " + str + ", " + e.getMessage(), e);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? b(str, obj, obj2) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        String str;
        int i;
        String g;
        int i2 = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            String valueOf = String.valueOf(list.get(0));
            if (list.size() <= 1) {
                str = "1";
            } else {
                str = String.valueOf(list.get(1));
            }
            if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase("null")) {
                if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                    try {
                        i = Integer.parseInt(str);
                    } catch (Throwable unused) {
                    }
                    if (i != 1) {
                        g = com.mbridge.msdk.config.component.common.file.a.c(valueOf);
                    } else {
                        g = com.mbridge.msdk.config.component.common.file.a.g(valueOf);
                    }
                    i2 = !TextUtils.isEmpty(g) ? 1 : 0;
                }
                i = 1;
                if (i != 1) {
                }
                i2 = !TextUtils.isEmpty(g) ? 1 : 0;
            } else {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        String str;
        String str2;
        int i;
        if (obj instanceof List) {
            List list = (List) obj;
            String valueOf = String.valueOf(list.get(0));
            if (list.size() <= 1) {
                str2 = "1";
            } else {
                str2 = String.valueOf(list.get(1));
            }
            if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase("null")) {
                if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("null")) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (Throwable unused) {
                    }
                    if (i != 1) {
                        String concat = "template".concat("/").concat(valueOf);
                        if (com.mbridge.msdk.config.component.common.file.a.j(concat)) {
                            str = "assets://".concat(concat);
                        }
                    } else {
                        str = com.mbridge.msdk.config.component.common.file.a.g(valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(TextUtils.isEmpty(str) ? "" : str);
                }
                i = 1;
                if (i != 1) {
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(TextUtils.isEmpty(str) ? "" : str);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        str = "";
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(TextUtils.isEmpty(str) ? "" : str);
    }

    private String a(File file) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[8192];
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception e) {
            q0.b("OperatorFile", "Calculate MD5 error: " + e.getMessage());
            return null;
        }
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("870")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("871")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("872")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("873")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("874")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("901"));
    }
}
