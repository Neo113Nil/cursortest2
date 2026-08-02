package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: km */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0401km implements InterfaceC0438lm, InterfaceC0512nm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4444a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f4445b;

    public C0401km(ClipData clipData, int i) {
        this.f4445b = AbstractC0364jm.m2934b(clipData, i);
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: a */
    public ClipData mo3049a() {
        return ((ContentInfo) this.f4445b).getClip();
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: b */
    public int mo3050b() {
        return ((ContentInfo) this.f4445b).getFlags();
    }

    @Override // p000.InterfaceC0438lm
    public C0549om build() {
        return new C0549om(new C0401km(((ContentInfo.Builder) this.f4445b).build()));
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: c */
    public ContentInfo mo3051c() {
        return (ContentInfo) this.f4445b;
    }

    @Override // p000.InterfaceC0438lm
    /* JADX INFO: renamed from: d */
    public void mo3052d(Uri uri) {
        ((ContentInfo.Builder) this.f4445b).setLinkUri(uri);
    }

    @Override // p000.InterfaceC0512nm
    /* JADX INFO: renamed from: e */
    public int mo3053e() {
        return ((ContentInfo) this.f4445b).getSource();
    }

    @Override // p000.InterfaceC0438lm
    /* JADX INFO: renamed from: f */
    public void mo3054f(int i) {
        ((ContentInfo.Builder) this.f4445b).setFlags(i);
    }

    @Override // p000.InterfaceC0438lm
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f4445b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f4444a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f4445b) + "}";
            default:
                return super.toString();
        }
    }

    public C0401km(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f4445b = contentInfo;
    }
}
