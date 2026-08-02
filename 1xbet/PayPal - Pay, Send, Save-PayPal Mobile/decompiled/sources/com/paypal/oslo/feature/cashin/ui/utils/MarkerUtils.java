package com.paypal.oslo.feature.cashin.ui.utils;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "location", "Lcom/google/android/gms/maps/model/LatLng;", "locationToLatLng", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;)Lcom/google/android/gms/maps/model/LatLng;", "", "generateMarkerTitle", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;)Ljava/lang/String;", "getMarkerSnippet", "Landroid/content/Context;", "context", "", "vectorResourceId", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "vectorToBitmap", "(Landroid/content/Context;I)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "createUserLocationIcon", "(Landroid/content/Context;)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarkerUtils {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MarkerUtils() {
    }

    public final com.google.android.gms.maps.model.LatLng locationToLatLng(com.paypal.oslo.feature.cashin.domain.model.CashInStore location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        return new com.google.android.gms.maps.model.LatLng(location.getGeoLocation().getLatitude(), location.getGeoLocation().getLongitude());
    }

    public final java.lang.String generateMarkerTitle(com.paypal.oslo.feature.cashin.domain.model.CashInStore location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        return location.getName();
    }

    public final java.lang.String getMarkerSnippet(com.paypal.oslo.feature.cashin.domain.model.CashInStore location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        return location.getAddress().getLine1();
    }

    public final com.google.android.gms.maps.model.BitmapDescriptor vectorToBitmap(android.content.Context context, int vectorResourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, vectorResourceId);
            if (drawable == null) {
                return null;
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(createBitmap);
        } catch (java.lang.UnsupportedOperationException e) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "MarkerUtils: Failed to convert vector to bitmap", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            return null;
        }
    }

    public final com.google.android.gms.maps.model.BitmapDescriptor createUserLocationIcon(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(40, 40, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(-1);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setAntiAlias(true);
            canvas.drawCircle(20.0f, 20.0f, 20.0f, paint);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColor(-12417548);
            paint2.setStyle(android.graphics.Paint.Style.FILL);
            paint2.setAntiAlias(true);
            canvas.drawCircle(20.0f, 20.0f, 16.0f, paint2);
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(createBitmap);
        } catch (java.lang.UnsupportedOperationException e) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "MarkerUtils: Failed to create user location icon", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            return null;
        }
    }
}
