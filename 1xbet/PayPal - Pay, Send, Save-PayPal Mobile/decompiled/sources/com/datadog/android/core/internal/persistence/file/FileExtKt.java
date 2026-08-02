package com.datadog.android.core.internal.persistence.file;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\u0005\u001a\u001b\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u0005\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016\u001a+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u0005\u001a\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"\u001a%\u0010#\u001a\u0004\u0018\u00010 *\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010&\u001a\u00020\u0003*\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b&\u0010'\u001aB\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010(*\u00020\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\u00012\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0002\b,H\u0002¢\u0006\u0004\b.\u0010/\u001a-\u00101\u001a\u00020\u0007*\u00020\u00002\u0006\u00100\u001a\u00020 2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b1\u00102"}, d2 = {"Ljava/io/File;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "canReadSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)Z", "canWriteSafe", "", "deleteDirectoryContentsSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "deleteSafe", "existsSafe", "isDirectorySafe", "isFileSafe", "", "lengthSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)J", "", "listFilesSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)[Ljava/io/File;", "Ljava/io/FilenameFilter;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;Ljava/io/FilenameFilter;)[Ljava/io/File;", "Ljava/io/FileFilter;", "(Ljava/io/File;Ljava/io/FileFilter;Lcom/datadog/android/api/InternalLogger;)[Ljava/io/File;", "mkdirsSafe", "", "readBytesSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)[B", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "", "readLinesSafe", "(Ljava/io/File;Ljava/nio/charset/Charset;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "readTextSafe", "(Ljava/io/File;Ljava/nio/charset/Charset;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/String;", "dest", "renameToSafe", "(Ljava/io/File;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)Z", "T", "p0", "p1", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "p2", "Camera2StreamConfigurationMap", "(Ljava/io/File;Ljava/lang/Object;Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "text", "writeTextSafe", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;Lcom/datadog/android/api/InternalLogger;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileExtKt {
    private static final <T> T Camera2StreamConfigurationMap(final java.io.File file, T t, com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function1<? super java.io.File, ? extends T> function1) {
        try {
            return function1.invoke(file);
        } catch (java.lang.SecurityException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Security exception was thrown for file ".concat(java.lang.String.valueOf(file.getPath()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return t;
        } catch (java.lang.Exception e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unexpected exception was thrown for file ".concat(java.lang.String.valueOf(file.getPath()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return t;
        }
    }

    public static final boolean canWriteSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$canWriteSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Boolean.valueOf(file2.canWrite());
            }
        })).booleanValue();
    }

    public static final boolean canReadSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$canReadSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Boolean.valueOf(file2.canRead());
            }
        })).booleanValue();
    }

    public static final boolean deleteSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$deleteSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Boolean.valueOf(file2.delete());
            }
        })).booleanValue();
    }

    public static final boolean existsSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$existsSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Boolean.valueOf(file2.exists());
            }
        })).booleanValue();
    }

    public static final boolean isFileSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$isFileSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Boolean.valueOf(file2.isFile());
            }
        })).booleanValue();
    }

    public static final boolean isDirectorySafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$isDirectorySafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Boolean.valueOf(file2.isDirectory());
            }
        })).booleanValue();
    }

    public static final java.io.File[] listFilesSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return (java.io.File[]) Camera2StreamConfigurationMap(file, null, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.io.File[]>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.io.File[] invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return file2.listFiles();
            }
        });
    }

    public static final java.io.File[] listFilesSafe(java.io.File file, final java.io.FileFilter fileFilter, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return (java.io.File[]) Camera2StreamConfigurationMap(file, null, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.io.File[]>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.io.File[] invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return file2.listFiles(fileFilter);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public static final java.io.File[] listFilesSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger, final java.io.FilenameFilter filenameFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filenameFilter, "");
        return (java.io.File[]) Camera2StreamConfigurationMap(file, null, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.io.File[]>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$3
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.io.File[] invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return file2.listFiles(filenameFilter);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public static final long lengthSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Number) Camera2StreamConfigurationMap(file, 0L, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Long>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$lengthSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Long invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Long.valueOf(file2.length());
            }
        })).longValue();
    }

    public static final boolean mkdirsSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$mkdirsSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                return java.lang.Boolean.valueOf(file2.mkdirs());
            }
        })).booleanValue();
    }

    public static final boolean renameToSafe(java.io.File file, final java.io.File file2, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((java.lang.Boolean) Camera2StreamConfigurationMap(file, java.lang.Boolean.FALSE, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$renameToSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.io.File file3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file3, "");
                return java.lang.Boolean.valueOf(file3.renameTo(file2));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        })).booleanValue();
    }

    public static final void deleteDirectoryContentsSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.io.File[] listFilesSafe = listFilesSafe(file, internalLogger);
        if (listFilesSafe != null) {
            for (java.io.File file2 : listFilesSafe) {
                deleteSafe(file2, internalLogger);
            }
        }
    }

    public static /* synthetic */ java.lang.String readTextSafe$default(java.io.File file, java.nio.charset.Charset charset, com.datadog.android.api.InternalLogger internalLogger, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return readTextSafe(file, charset, internalLogger);
    }

    public static final java.lang.String readTextSafe(java.io.File file, final java.nio.charset.Charset charset, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (existsSafe(file, internalLogger) && canReadSafe(file, internalLogger)) {
            return (java.lang.String) Camera2StreamConfigurationMap(file, null, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$readTextSafe$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke(java.io.File file2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                    return kotlin.io.FilesKt.readText(file2, charset);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        return null;
    }

    public static final byte[] readBytesSafe(java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (existsSafe(file, internalLogger) && canReadSafe(file, internalLogger)) {
            return (byte[]) Camera2StreamConfigurationMap(file, null, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, byte[]>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$readBytesSafe$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final byte[] invoke(java.io.File file2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                    return kotlin.io.FilesKt.readBytes(file2);
                }
            });
        }
        return null;
    }

    public static /* synthetic */ java.util.List readLinesSafe$default(java.io.File file, java.nio.charset.Charset charset, com.datadog.android.api.InternalLogger internalLogger, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return readLinesSafe(file, charset, internalLogger);
    }

    public static final java.util.List<java.lang.String> readLinesSafe(java.io.File file, final java.nio.charset.Charset charset, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (existsSafe(file, internalLogger) && canReadSafe(file, internalLogger)) {
            return (java.util.List) Camera2StreamConfigurationMap(file, null, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, java.util.List<? extends java.lang.String>>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.util.List<java.lang.String> invoke(java.io.File file2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                    return kotlin.io.FilesKt.readLines(file2, charset);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        return null;
    }

    public static /* synthetic */ void writeTextSafe$default(java.io.File file, java.lang.String str, java.nio.charset.Charset charset, com.datadog.android.api.InternalLogger internalLogger, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        writeTextSafe(file, str, charset, internalLogger);
    }

    public static final void writeTextSafe(java.io.File file, final java.lang.String str, final java.nio.charset.Charset charset, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (existsSafe(file, internalLogger) && canWriteSafe(file, internalLogger)) {
            Camera2StreamConfigurationMap(file, null, internalLogger, new kotlin.jvm.functions.Function1<java.io.File, kotlin.Unit>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$writeTextSafe$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.io.File file2) {
                    Camera2StreamConfigurationMap(file2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(java.io.File file2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
                    kotlin.io.FilesKt.writeText(file2, str, charset);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
    }
}
