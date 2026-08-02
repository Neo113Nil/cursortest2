package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateHandle_androidKt {
    public static final /* synthetic */ java.lang.String access$createMutuallyExclusiveErrorMessage(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '");
        sb.append(str);
        sb.append("', but not both.");
        return sb.toString();
    }
}
