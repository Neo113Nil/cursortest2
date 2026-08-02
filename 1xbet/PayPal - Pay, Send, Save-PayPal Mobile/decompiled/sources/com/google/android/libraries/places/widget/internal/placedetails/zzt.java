package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzt extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private final java.util.List zza;
    private final int zzb;

    public zzt(java.util.List list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
        this.zzb = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        com.google.android.libraries.places.widget.internal.placedetails.zzs zzsVar = (com.google.android.libraries.places.widget.internal.placedetails.zzs) viewHolder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzsVar, "");
        com.google.android.libraries.places.api.model.ConnectorAggregation connectorAggregation = (com.google.android.libraries.places.api.model.ConnectorAggregation) this.zza.get(i);
        android.content.Context context = zzsVar.itemView.getContext();
        android.widget.TextView zza = zzsVar.zza();
        com.google.android.libraries.places.api.model.EVConnectorType type = connectorAggregation.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        switch (type) {
            case EV_CONNECTOR_TYPE_UNSPECIFIED:
            case EV_CONNECTOR_TYPE_OTHER:
                i2 = com.google.android.libraries.places.R.string.unknown_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_J1772:
                i2 = com.google.android.libraries.places.R.string.j1772_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_TYPE_2:
                i2 = com.google.android.libraries.places.R.string.type_2_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CHADEMO:
                i2 = com.google.android.libraries.places.R.string.chademo_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CCS_COMBO_1:
                i2 = com.google.android.libraries.places.R.string.ccs_combo_1_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CCS_COMBO_2:
                i2 = com.google.android.libraries.places.R.string.ccs_combo_2_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_TESLA:
                i2 = com.google.android.libraries.places.R.string.tesla_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T:
                i2 = com.google.android.libraries.places.R.string.gb_t_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET:
                i2 = com.google.android.libraries.places.R.string.wall_outlet_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_NACS:
                i2 = com.google.android.libraries.places.R.string.nacs_outlet_ev_connector_type;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String string = context.getString(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        zza.setText(string);
        zzsVar.zzb().setText(context.getString(com.google.android.libraries.places.R.string.ev_charger_max_charge_rate_kw, java.lang.Integer.valueOf((int) connectorAggregation.getMaxChargeRateKw().doubleValue())));
        if (connectorAggregation.getAvailableCount() == null) {
            zzsVar.zzc().setVisibility(8);
            return;
        }
        androidx.cardview.widget.CardView zzc = zzsVar.zzc();
        int i3 = this.zzb;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectorAggregation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Integer availableCount = connectorAggregation.getAvailableCount();
        boolean z = (availableCount == null || availableCount.intValue() == 0) ? false : true;
        int color = context.getColor(com.google.android.libraries.places.R.color.places_color_neutral_container);
        int[] iArr = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, iArr);
        int color2 = obtainStyledAttributes.getColor(z ? com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorPositiveContainer : com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorNeutralContainer, color);
        obtainStyledAttributes.recycle();
        zzc.setCardBackgroundColor(color2);
        zzsVar.zzc().setVisibility(0);
        android.widget.TextView zzd = zzsVar.zzd();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectorAggregation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Integer availableCount2 = connectorAggregation.getAvailableCount();
        boolean z2 = (availableCount2 == null || availableCount2.intValue() == 0) ? false : true;
        int color3 = context.getColor(com.google.android.libraries.places.R.color.places_color_on_neutral_container);
        int[] iArr2 = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr2, "");
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i3, iArr2);
        int color4 = obtainStyledAttributes2.getColor(z2 ? com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorOnPositiveContainer : com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorOnNeutralContainer, color3);
        obtainStyledAttributes2.recycle();
        zzd.setTextColor(color4);
        zzsVar.zzd().setText(context.getString(com.google.android.libraries.places.R.string.ev_charger_connectors_available, connectorAggregation.getAvailableCount(), connectorAggregation.getCount()));
        zzsVar.zzc().setContentDescription(context.getString(com.google.android.libraries.places.R.string.ev_charger_connectors_available_content_description, connectorAggregation.getAvailableCount(), connectorAggregation.getCount()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.libraries.places.R.layout.ev_charging_option_item, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(inflate);
        return new com.google.android.libraries.places.widget.internal.placedetails.zzs(inflate);
    }
}
