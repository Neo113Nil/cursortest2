package p000;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends xl1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Intent f7146j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ GoogleApiActivity f7147k;

    public sl1(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f7146j = intent;
        this.f7147k = googleApiActivity;
    }

    @Override // p000.xl1
    /* JADX INFO: renamed from: a */
    public final void mo4536a() {
        Intent intent = this.f7146j;
        if (intent != null) {
            this.f7147k.startActivityForResult(intent, 2);
        }
    }
}
