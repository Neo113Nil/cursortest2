package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzy extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private final java.util.List zza;
    private final java.time.Instant zzb;

    public zzy(java.util.List list, java.time.Instant instant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
        this.zzb = instant;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        java.lang.String string;
        java.lang.String string2;
        com.google.android.libraries.places.widget.internal.placedetails.zzx zzxVar = (com.google.android.libraries.places.widget.internal.placedetails.zzx) viewHolder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzxVar, "");
        com.google.android.libraries.places.api.model.FuelPrice fuelPrice = (com.google.android.libraries.places.api.model.FuelPrice) this.zza.get(i);
        android.content.Context context = zzxVar.itemView.getContext();
        android.widget.TextView zza = zzxVar.zza();
        com.google.android.libraries.places.api.model.FuelPrice.FuelType type = fuelPrice.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        int ordinal = type.ordinal();
        if (ordinal == 1) {
            string = context.getString(com.google.android.libraries.places.R.string.fuel_type_diesel);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (ordinal == 2) {
            string = context.getString(com.google.android.libraries.places.R.string.fuel_type_regular);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (ordinal == 3) {
            string = context.getString(com.google.android.libraries.places.R.string.fuel_type_midgrade);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (ordinal != 4) {
            string = "";
        } else {
            string = context.getString(com.google.android.libraries.places.R.string.fuel_type_premium);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        }
        zza.setText(string);
        android.widget.TextView zzb = zzxVar.zzb();
        java.time.Instant instant = this.zzb;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fuelPrice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.util.Currency currency = java.util.Currency.getInstance(fuelPrice.getPrice().getCurrencyCode());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
        java.lang.String symbol = currency.getSymbol(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(symbol, "");
        double longValue = fuelPrice.getPrice().getUnits().longValue();
        double intValue = fuelPrice.getPrice().getNanos().intValue();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(locale, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(longValue + (intValue / 1.0E9d))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        if (com.google.android.libraries.places.widget.internal.placedetails.zzz.zzb(fuelPrice, instant)) {
            string2 = context.getString(com.google.android.libraries.places.R.string.stale_fuel_price, symbol, format);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        } else {
            string2 = context.getString(com.google.android.libraries.places.R.string.fuel_price, symbol, format);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        }
        zzb.setText(string2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.libraries.places.R.layout.fuel_option_item, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(inflate);
        return new com.google.android.libraries.places.widget.internal.placedetails.zzx(inflate);
    }
}
