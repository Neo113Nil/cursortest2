package androidx.fragment.app;

/* loaded from: classes3.dex */
public interface FragmentResultOwner {
    void clearFragmentResult(java.lang.String str);

    void clearFragmentResultListener(java.lang.String str);

    void setFragmentResult(java.lang.String str, android.os.Bundle bundle);

    void setFragmentResultListener(java.lang.String str, androidx.view.LifecycleOwner lifecycleOwner, androidx.fragment.app.FragmentResultListener fragmentResultListener);
}
