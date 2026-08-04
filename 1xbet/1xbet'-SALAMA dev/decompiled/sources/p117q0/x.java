package p117q0;

import android.media.VolumeProvider;
import androidx.datastore.preferences.protobuf.C0665j;

/* JADX INFO: loaded from: classes.dex */
public final class x extends VolumeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0665j f15795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0665j c0665j, int i7, int i8, int i9) {
        super(i7, i8, i9);
        this.f15795a = c0665j;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i7) {
        this.f15795a.getClass();
        C0665j.i(i7);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i7) {
        this.f15795a.getClass();
        C0665j.j(i7);
    }
}
