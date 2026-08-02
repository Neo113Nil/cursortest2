package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000e\u001a\u00020\u0000*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0011\u001a\u00020\u0004*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u0012*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lkotlin/io/FilePathComponents;", "toComponents", "(Ljava/io/File;)Lkotlin/io/FilePathComponents;", "beginIndex", "endIndex", "subPath", "(Ljava/io/File;II)Ljava/io/File;", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "rootName", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "root", "", "isRooted", "(Ljava/io/File;)Z"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes.dex */
public class FilesKt__FilePathComponentsKt {
    private static final int Camera2StreamConfigurationMap(java.lang.String str) {
        int indexOf$default;
        java.lang.String str2 = str;
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, java.io.File.separatorChar, 0, false, 4, (java.lang.Object) null);
        if (indexOf$default2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != java.io.File.separatorChar || (indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, java.io.File.separatorChar, 2, false, 4, (java.lang.Object) null)) < 0) {
                return 1;
            }
            int indexOf$default3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, java.io.File.separatorChar, indexOf$default + 1, false, 4, (java.lang.Object) null);
            return indexOf$default3 >= 0 ? indexOf$default3 + 1 : str.length();
        }
        if (indexOf$default2 > 0 && str.charAt(indexOf$default2 - 1) == ':') {
            return indexOf$default2 + 1;
        }
        if (indexOf$default2 == -1 && kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, false, 2, (java.lang.Object) null)) {
            return str.length();
        }
        return 0;
    }

    public static final java.lang.String getRootName(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        java.lang.String path2 = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "");
        java.lang.String substring = path.substring(0, Camera2StreamConfigurationMap(path2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final java.io.File getRoot(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return new java.io.File(kotlin.io.FilesKt.getRootName(file));
    }

    public static final boolean isRooted(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        return Camera2StreamConfigurationMap(path) > 0;
    }

    public static final kotlin.io.FilePathComponents toComponents(java.io.File file) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNull(path);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(path);
        java.lang.String substring = path.substring(0, Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = path.substring(Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.String str = substring2;
        if (str.length() == 0) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{java.io.File.separatorChar}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
            java.util.Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList2.add(new java.io.File((java.lang.String) it.next()));
            }
            arrayList = arrayList2;
        }
        return new kotlin.io.FilePathComponents(new java.io.File(substring), arrayList);
    }

    public static final java.io.File subPath(java.io.File file, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return kotlin.io.FilesKt.toComponents(file).subPath(i, i2);
    }
}
