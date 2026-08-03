package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class v {
    public static byte[] a(java.io.InputStream inputStream) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.fyber.inneractive.sdk.util.f.b.f4291a.poll();
        if (byteBuffer == null) {
            byteBuffer = java.nio.ByteBuffer.allocateDirect(16384);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] array = (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
        while (true) {
            int read = inputStream.read(array, 0, array.length);
            if (read == -1) {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                b(byteArrayOutputStream);
                com.fyber.inneractive.sdk.util.f.b.f4291a.offer(byteBuffer);
                return byteArray;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
    }

    public static java.lang.StringBuffer b(java.io.InputStream inputStream) {
        if (inputStream == null) {
            throw new java.lang.IllegalArgumentException("stream required");
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.fyber.inneractive.sdk.util.f.b.f4291a.poll();
        if (byteBuffer == null) {
            byteBuffer = java.nio.ByteBuffer.allocateDirect(16384);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        byte[] array = (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new java.lang.String(array, 0, i));
            i = inputStream.read(array);
        }
        com.fyber.inneractive.sdk.util.f.b.f4291a.offer(byteBuffer);
        return stringBuffer;
    }

    public static void b(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    public static java.lang.String b(java.lang.Throwable th) {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th.printStackTrace(new java.io.PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (java.lang.Exception unused) {
            return "bad stackToString";
        }
    }

    public static void a(java.io.InputStream inputStream, java.io.FileOutputStream fileOutputStream) {
        if (inputStream != null) {
            byte[] bArr = new byte[65536];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    com.fyber.inneractive.sdk.util.IAlog.a("Copied stream content length = %d", java.lang.Integer.valueOf(i));
                    return;
                } else {
                    i += read;
                    fileOutputStream.write(bArr, 0, read);
                }
            }
        } else {
            throw new java.io.IOException("Unable to copy from or to a null stream.");
        }
    }

    public static void a(android.view.View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            if (view.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static android.widget.RelativeLayout.LayoutParams a(int i, int i2, int... iArr) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i, i2);
        if (iArr.length > 0) {
            for (int i3 : iArr) {
                layoutParams.addRule(i3);
            }
        }
        return layoutParams;
    }

    public static java.lang.Object a(java.lang.ref.Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static int a(java.lang.String str, int i) {
        if (android.text.TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static int a(int i, int i2) {
        return java.lang.Integer.compare(i, i2);
    }

    public static java.lang.String a(java.lang.Throwable th) {
        java.lang.String message;
        if (th == null) {
            return null;
        }
        do {
            message = th.getMessage();
            th = th.getCause();
        } while (th != null);
        return message;
    }

    public static boolean a(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || str.trim().isEmpty()) ? false : true;
    }

    public static java.lang.String a(org.json.JSONObject jSONObject, java.lang.String str) {
        return (jSONObject == null || jSONObject.isNull(str)) ? "" : jSONObject.optString(str);
    }
}
