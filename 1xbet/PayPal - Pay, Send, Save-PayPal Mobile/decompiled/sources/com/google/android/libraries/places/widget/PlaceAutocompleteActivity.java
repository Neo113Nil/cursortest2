package com.google.android.libraries.places.widget;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/internal/autocomplete/base/BaseAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/listener/PredictionSelectionListener;", "<init>", "()V", "resultErrorStatus", "Lcom/google/android/gms/common/api/Status;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPredictionSelected", "prediction", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "sessionToken", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "onError", "errorStatus", "setTestFragmentFactory", "factory", "Landroidx/fragment/app/FragmentFactory;", "Companion", "java.com.google.android.libraries.places.widget_place_autocomplete_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaceAutocompleteActivity extends com.google.android.libraries.places.internal.zzni implements com.google.android.libraries.places.widget.listener.PredictionSelectionListener {
    public static final int RESULT_CANCELED = 0;
    private com.google.android.gms.common.api.Status zzb;
    public static final int RESULT_ERROR = 2;
    public static final int RESULT_OK = -1;

    @Override // com.google.android.libraries.places.internal.zzni, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
        if (baseAutocompleteImplFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(baseAutocompleteImplFragment, "");
            baseAutocompleteImplFragment.zzc(this);
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PredictionSelectionListener
    public final void onError(com.google.android.gms.common.api.Status errorStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStatus, "");
        if (!errorStatus.isCanceled()) {
            this.zzb = errorStatus;
            zzc(RESULT_ERROR, errorStatus);
            return;
        }
        com.google.android.gms.common.api.Status status = this.zzb;
        if (status == null) {
            zzb(RESULT_CANCELED, null, null, errorStatus);
        } else {
            zzb(RESULT_ERROR, null, null, status);
            this.zzb = null;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PredictionSelectionListener
    public final void onPredictionSelected(com.google.android.libraries.places.api.model.AutocompletePrediction prediction, com.google.android.libraries.places.api.model.AutocompleteSessionToken sessionToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prediction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionToken, "");
        zzb(RESULT_OK, prediction, sessionToken, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }

    @Override // com.google.android.libraries.places.internal.zzni, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.google.android.libraries.places.internal.zzni, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.google.android.libraries.places.internal.zzni, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // com.google.android.libraries.places.internal.zzni, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
