package com.google.android.gms.location;

/* loaded from: classes4.dex */
public class LocationServices {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API = com.google.android.gms.internal.identity.zzbi.zzb;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.FusedLocationProviderApi FusedLocationApi = new com.google.android.gms.internal.identity.zzbb();

    @java.lang.Deprecated
    public static final com.google.android.gms.location.GeofencingApi GeofencingApi = new com.google.android.gms.internal.identity.zzcr();

    @java.lang.Deprecated
    public static final com.google.android.gms.location.SettingsApi SettingsApi = new com.google.android.gms.internal.identity.zzcz();

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.identity.zzbi(activity);
    }

    public static com.google.android.gms.location.FusedOrientationProviderClient getFusedOrientationProviderClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.identity.zzci(activity);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.identity.zzct(activity);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.identity.zzda(activity);
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.content.Context context) {
        return new com.google.android.gms.internal.identity.zzbi(context);
    }

    public static com.google.android.gms.location.FusedOrientationProviderClient getFusedOrientationProviderClient(android.content.Context context) {
        return new com.google.android.gms.internal.identity.zzci(context);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.content.Context context) {
        return new com.google.android.gms.internal.identity.zzct(context);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.content.Context context) {
        return new com.google.android.gms.internal.identity.zzda(context);
    }

    private LocationServices() {
    }
}
