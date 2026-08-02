package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentContainer {
    public abstract android.view.View onFindViewById(int i);

    public abstract boolean onHasView();

    @java.lang.Deprecated
    public androidx.fragment.app.Fragment instantiate(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        return androidx.fragment.app.Fragment.instantiate(context, str, bundle);
    }
}
