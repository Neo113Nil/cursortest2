package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/credentials/CredentialManagerCallback;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "E", "result", "", "onResult", "(Ljava/lang/Object;)V", "e", "onError"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CredentialManagerCallback<R, E> {
    void onError(E e);

    void onResult(R result);
}
