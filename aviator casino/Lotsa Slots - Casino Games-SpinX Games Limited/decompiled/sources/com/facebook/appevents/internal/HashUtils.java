package com.facebook.appevents.internal;

/* compiled from: HashUtils.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J!\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/internal/HashUtils;", "", "()V", "BUFFER_SIZE", "", com.facebook.appevents.internal.HashUtils.MD5, "", "TAG", "kotlin.jvm.PlatformType", "TRUSTED_CERTS", "", "[Ljava/lang/String;", "computeChecksum", "path", "computeChecksumWithPackageManager", "context", "Landroid/content/Context;", "nanosTimeout", "", "(Landroid/content/Context;Ljava/lang/Long;)Ljava/lang/String;", "computeFileMd5", "file", "Ljava/io/File;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HashUtils {
    private static final int BUFFER_SIZE = 1024;
    private static final java.lang.String MD5 = "MD5";
    public static final com.facebook.appevents.internal.HashUtils INSTANCE = new com.facebook.appevents.internal.HashUtils();
    private static final java.lang.String TAG = "HashUtils";
    private static final java.lang.String[] TRUSTED_CERTS = {"MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK", "MIIEqDCCA5CgAwIBAgIJANWFuGx90071MA0GCSqGSIb3DQEBBAUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0wODA0MTUyMzM2NTZaFw0zNTA5MDEyMzM2NTZaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANbOLggKv+IxTdGNs8/TGFy0PTP6DHThvbbR24kT9ixcOd9W+EaBPWW+wPPKQmsHxajtWjmQwWfna8mZuSeJS48LIgAZlKkpFeVyxW0qMBujb8X8ETrWy550NaFtI6t9+u7hZeTfHwqNvacKhp1RbE6dBRGWynwMVX8XW8N1+UjFaq6GCJukT4qmpN2afb8sCjUigq0GuMwYXrFVee74bQgLHWGJwPmvmLHC69EH6kWr22ijx4OKXlSIx2xT1AsSHee70w5iDBiK4aph27yH3TxkXy9V89TDdexAcKk/cVHYNnDBapcavl7y0RiQ4biu8ymM8Ga/nmzhRKya6G0cGw8CAQOjgfwwgfkwHQYDVR0OBBYEFI0cxb6VTEM8YYY6FbBMvAPyT+CyMIHJBgNVHSMEgcEwgb6AFI0cxb6VTEM8YYY6FbBMvAPyT+CyoYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJANWFuGx90071MAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEEBQADggEBABnTDPEF+3iSP0wNfdIjIz1AlnrPzgAIHVvXxunW7SBrDhEglQZBbKJEk5kT0mtKoOD1JMrSu1xuTKEBahWRbqHsXclaXjoBADb0kkjVEJu/Lh5hgYZnOjvlba8Ld7HCKePCVePoTJBdI4fvugnL8TsgK05aIskyY0hKI9L8KfqfGTl1lzOv2KoWD0KWwtAWPoGChZxmQ+nBli+gwYMzM1vAkP+aayLe0a1EQimlOalO762r0GXO0ks+UeXde2Z4e+8S/pf7pITEI/tP+MxJTALw9QUWEv9lKTk+jkbqxbsh8nfBUapfKqYn0eidpwq2AzVp3juYl7//fKnaPhJD9gs="};

    private HashUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String computeChecksum(java.lang.String path) throws java.lang.Exception {
        return INSTANCE.computeFileMd5(new java.io.File(path));
    }

    private final java.lang.String computeFileMd5(java.io.File file) throws java.lang.Exception {
        int read;
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file), 1024);
        try {
            java.io.BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(MD5);
            byte[] bArr = new byte[1024];
            do {
                read = bufferedInputStream2.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            java.lang.String bigInteger = new java.math.BigInteger(1, messageDigest.digest()).toString(16);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(1, md.digest()).toString(16)");
            kotlin.io.CloseableKt.closeFinally(bufferedInputStream, null);
            return bigInteger;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final java.lang.String computeChecksumWithPackageManager(android.content.Context context, java.lang.Long nanosTimeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        java.lang.String[] strArr = TRUSTED_CERTS;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0))));
        }
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList);
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        final java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            java.lang.reflect.Field field = java.lang.Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            final java.lang.Object obj = field.get(null);
            java.lang.Class<?> cls = java.lang.Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(com.facebook.appevents.internal.HashUtils.class.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler() { // from class: com.facebook.appevents.internal.HashUtils$computeChecksumWithPackageManager$listener$1
                /* JADX WARN: Type inference failed for: r8v11, types: [T, java.lang.String] */
                @Override // java.lang.reflect.InvocationHandler
                public java.lang.Object invoke(java.lang.Object o, java.lang.reflect.Method method, java.lang.Object[] objects) {
                    java.lang.String str2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objects, "objects");
                    try {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(method.getName(), "onChecksumsReady") && objects.length == 1) {
                            java.lang.Object obj2 = objects[0];
                            if (obj2 instanceof java.util.List) {
                                for (java.lang.Object obj3 : (java.util.List) obj2) {
                                    if (obj3 != null) {
                                        java.lang.reflect.Method method2 = obj3.getClass().getMethod("getSplitName", new java.lang.Class[0]);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                        java.lang.reflect.Method method3 = obj3.getClass().getMethod("getType", new java.lang.Class[0]);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method3, "c.javaClass.getMethod(\"getType\")");
                                        if (method2.invoke(obj3, new java.lang.Object[0]) == null && kotlin.jvm.internal.Intrinsics.areEqual(method3.invoke(obj3, new java.lang.Object[0]), obj)) {
                                            java.lang.reflect.Method method4 = obj3.getClass().getMethod("getValue", new java.lang.Class[0]);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method4, "c.javaClass.getMethod(\"getValue\")");
                                            java.lang.Object invoke = method4.invoke(obj3, new java.lang.Object[0]);
                                            if (invoke == null) {
                                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                            }
                                            objectRef.element = new java.math.BigInteger(1, (byte[]) invoke).toString(16);
                                            reentrantLock.lock();
                                            try {
                                                newCondition.signalAll();
                                                return null;
                                            } finally {
                                                reentrantLock.unlock();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        str2 = com.facebook.appevents.internal.HashUtils.TAG;
                        android.util.Log.d(str2, "Can't fetch checksum.", th);
                    }
                    return null;
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newProxyInstance, "var resultChecksum: String? = null\n    val lock = ReentrantLock()\n    val checksumReady = lock.newCondition()\n    lock.lock()\n\n    try {\n      val checksumClass = Class.forName(\"android.content.pm.Checksum\")\n      val typeWholeMd5Field: Field = checksumClass.getField(\"TYPE_WHOLE_MD5\")\n      val TYPE_WHOLE_MD5 = typeWholeMd5Field.get(null)\n      val checksumReadyListenerClass =\n          Class.forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")\n      val listener: Any =\n          Proxy.newProxyInstance(\n              HashUtils::class.java.classLoader,\n              arrayOf(checksumReadyListenerClass),\n              object : InvocationHandler {\n                override operator fun invoke(o: Any?, method: Method, objects: Array<Any>): Any? {\n                  try {\n                    if (method.name == \"onChecksumsReady\" &&\n                        objects.size == 1 &&\n                        objects[0] is List<*>) {\n                      val list = objects[0] as List<*>\n                      for (c in list) {\n                        if (c != null) {\n                          val getSplitNameMethod: Method = c.javaClass.getMethod(\"getSplitName\")\n                          val getTypeMethod: Method = c.javaClass.getMethod(\"getType\")\n                          if (getSplitNameMethod.invoke(c) == null &&\n                              getTypeMethod.invoke(c) == TYPE_WHOLE_MD5) {\n                            val getValueMethod: Method = c.javaClass.getMethod(\"getValue\")\n                            val checksumValue = getValueMethod.invoke(c) as ByteArray\n                            resultChecksum = BigInteger(1, checksumValue).toString(16)\n                            lock.lock()\n                            try {\n                              checksumReady.signalAll()\n                            } finally {\n                              lock.unlock()\n                            }\n                            return null\n                          }\n                        }\n                      }\n                    }\n                  } catch (t: Throwable) {\n                    Log.d(TAG, \"Can't fetch checksum.\", t)\n                  }\n                  return null\n                }\n              })");
            java.lang.reflect.Method method = android.content.pm.PackageManager.class.getMethod("requestChecksums", java.lang.String.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.util.List.class, cls);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method, "PackageManager::class\n              .java\n              .getMethod(\n                  \"requestChecksums\",\n                  String::class.java,\n                  Boolean::class.javaPrimitiveType,\n                  Int::class.javaPrimitiveType,\n                  MutableList::class.java,\n                  checksumReadyListenerClass)");
            method.invoke(context.getPackageManager(), context.getPackageName(), false, obj, kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) mutableList), newProxyInstance);
            if (nanosTimeout == null) {
                newCondition.await();
            } else {
                newCondition.awaitNanos(nanosTimeout.longValue());
            }
            java.lang.String str2 = (java.lang.String) objectRef.element;
            reentrantLock.unlock();
            return str2;
        } catch (java.lang.Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }
}
