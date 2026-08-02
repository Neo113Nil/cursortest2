package financial.atomic.transact.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "other", "diff", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DiffKt {
    public static final java.lang.String diff(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        name.fraser.neil.plaintext.diff_match_patch diff_match_patchVar = new name.fraser.neil.plaintext.diff_match_patch();
        java.lang.String patch_toText = diff_match_patchVar.patch_toText(diff_match_patchVar.patch_make(str, str2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patch_toText, "");
        return patch_toText;
    }
}
