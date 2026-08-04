package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class S extends p033e3.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f8408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f8408c = appCompatTextView;
    }

    @Override // p033e3.h, androidx.appcompat.widget.Q
    public final void J(int i7) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i7);
    }

    @Override // p033e3.h, androidx.appcompat.widget.Q
    public final void U(int i7) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i7);
    }
}
