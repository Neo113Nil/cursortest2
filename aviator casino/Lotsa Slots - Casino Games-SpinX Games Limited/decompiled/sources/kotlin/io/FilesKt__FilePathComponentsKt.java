package kotlin.io;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilePathComponents.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¢\u0006\u0002\b\u0003\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0005H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"getRootLength", "", "", "getRootLength$FilesKt__FilePathComponentsKt", "rootName", "Ljava/io/File;", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "isRooted", "", "(Ljava/io/File;)Z", "toComponents", "Lkotlin/io/FilePathComponents;", "subPath", "beginIndex", "endIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes6.dex */
public class FilesKt__FilePathComponentsKt {
    private static final int getRootLength$FilesKt__FilePathComponentsKt(java.lang.String str) {
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        java.lang.String path2 = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        java.lang.String substring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final java.io.File getRoot(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return new java.io.File(kotlin.io.FilesKt.getRootName(file));
    }

    public static final boolean isRooted(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return getRootLength$FilesKt__FilePathComponentsKt(path) > 0;
    }

    public static final kotlin.io.FilePathComponents toComponents(java.io.File file) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNull(path);
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        java.lang.String substring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        java.lang.String substring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        return kotlin.io.FilesKt.toComponents(file).subPath(i, i2);
    }
}
