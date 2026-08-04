package U;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f6373a;

    public f(Object obj) {
        this.f6373a = (InputContentInfo) obj;
    }

    @Override // U.g
    public final Uri b() {
        return this.f6373a.getContentUri();
    }

    @Override // U.g
    public final void c() {
        this.f6373a.requestPermission();
    }

    @Override // U.g
    public final ClipDescription getDescription() {
        return this.f6373a.getDescription();
    }

    @Override // U.g
    public final Uri j() {
        return this.f6373a.getLinkUri();
    }

    @Override // U.g
    public final Object w() {
        return this.f6373a;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6373a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
