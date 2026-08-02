package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: r6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0644r6 implements InterfaceC0866x6, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: j */
    public DialogInterfaceC0715t3 f6717j;

    /* JADX INFO: renamed from: k */
    public C0681s6 f6718k;

    /* JADX INFO: renamed from: l */
    public CharSequence f6719l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0903y6 f6720m;

    public DialogInterfaceOnClickListenerC0644r6(C0903y6 c0903y6) {
        this.f6720m = c0903y6;
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: a */
    public final boolean mo4257a() {
        DialogInterfaceC0715t3 dialogInterfaceC0715t3 = this.f6717j;
        if (dialogInterfaceC0715t3 != null) {
            return dialogInterfaceC0715t3.isShowing();
        }
        return false;
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: b */
    public final int mo4258b() {
        return 0;
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: d */
    public final Drawable mo4259d() {
        return null;
    }

    @Override // p000.InterfaceC0866x6
    public final void dismiss() {
        DialogInterfaceC0715t3 dialogInterfaceC0715t3 = this.f6717j;
        if (dialogInterfaceC0715t3 != null) {
            dialogInterfaceC0715t3.dismiss();
            this.f6717j = null;
        }
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: e */
    public final void mo4260e(CharSequence charSequence) {
        this.f6719l = charSequence;
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: f */
    public final void mo4261f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: g */
    public final void mo4262g(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: k */
    public final void mo4263k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: l */
    public final void mo4264l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: m */
    public final void mo4265m(int i, int i2) {
        if (this.f6718k == null) {
            return;
        }
        C0903y6 c0903y6 = this.f6720m;
        C0678s3 c0678s3 = new C0678s3(c0903y6.getPopupContext());
        C0530o3 c0530o3 = (C0530o3) c0678s3.f7022k;
        CharSequence charSequence = this.f6719l;
        if (charSequence != null) {
            c0530o3.f5589d = charSequence;
        }
        C0681s6 c0681s6 = this.f6718k;
        int selectedItemPosition = c0903y6.getSelectedItemPosition();
        c0530o3.f5597l = c0681s6;
        c0530o3.f5598m = this;
        c0530o3.f5600o = selectedItemPosition;
        c0530o3.f5599n = true;
        DialogInterfaceC0715t3 dialogInterfaceC0715t3M4471a = c0678s3.m4471a();
        this.f6717j = dialogInterfaceC0715t3M4471a;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0715t3M4471a.f7267p.f6678f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f6717j.show();
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: n */
    public final int mo4266n() {
        return 0;
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: o */
    public final CharSequence mo4267o() {
        return this.f6719l;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0903y6 c0903y6 = this.f6720m;
        c0903y6.setSelection(i);
        if (c0903y6.getOnItemClickListener() != null) {
            c0903y6.performItemClick(null, i, this.f6718k.getItemId(i));
        }
        dismiss();
    }

    @Override // p000.InterfaceC0866x6
    /* JADX INFO: renamed from: p */
    public final void mo4268p(ListAdapter listAdapter) {
        this.f6718k = (C0681s6) listAdapter;
    }
}
