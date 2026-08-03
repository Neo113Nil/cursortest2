package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class SupportFragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper.Stub {
    private final androidx.fragment.app.Fragment zza;

    private SupportFragmentWrapper(androidx.fragment.app.Fragment fragment) {
        this.zza = fragment;
    }

    public static com.google.android.gms.dynamic.SupportFragmentWrapper wrap(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            return new com.google.android.gms.dynamic.SupportFragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzA(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.view.View view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(view);
        this.zza.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final android.os.Bundle zzc() {
        return this.zza.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzd() {
        return this.zza.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzg() {
        return this.zza.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final java.lang.String zzh() {
        return this.zza.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzi() {
        return wrap(this.zza.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
        return this.zza.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
        return this.zza.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzl() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzm() {
        return this.zza.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzn() {
        return this.zza.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzo() {
        return this.zza.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzp() {
        return this.zza.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzq() {
        return this.zza.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzr() {
        return this.zza.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.zza.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.view.View view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(view);
        this.zza.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzu(boolean z) {
        this.zza.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzv(boolean z) {
        this.zza.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzw(boolean z) {
        this.zza.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzx(boolean z) {
        this.zza.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzy(android.content.Intent intent) {
        this.zza.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzz(android.content.Intent intent, int i) {
        this.zza.startActivityForResult(intent, i);
    }
}
