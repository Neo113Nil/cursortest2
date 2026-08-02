package q0;

import android.media.VolumeProvider;
import androidx.datastore.preferences.protobuf.C0686j;

/* loaded from: classes.dex */
public final class x extends VolumeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0686j f15789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0686j c0686j, int i7, int i8, int i9) {
        super(i7, i8, i9);
        this.f15789a = c0686j;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i7) {
        this.f15789a.getClass();
        C0686j.i(i7);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i7) {
        this.f15789a.getClass();
        C0686j.j(i7);
    }
}
