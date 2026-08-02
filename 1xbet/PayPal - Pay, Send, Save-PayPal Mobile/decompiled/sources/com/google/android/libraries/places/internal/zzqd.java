package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzqd extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private final kotlinx.coroutines.CoroutineScope zza;
    private final com.google.android.libraries.places.widget.model.Orientation zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final java.util.List zzg;
    private final com.google.android.libraries.places.internal.zzpt zzh;
    private final java.util.List zzi;
    private final kotlin.jvm.functions.Function1 zzj;
    private java.util.List zzk;

    public zzqd(kotlinx.coroutines.CoroutineScope coroutineScope, com.google.android.libraries.places.widget.model.Orientation orientation, int i, int i2, boolean z, boolean z2, java.util.List list, com.google.android.libraries.places.internal.zzpt zzptVar, java.util.List list2, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.zza = coroutineScope;
        this.zzb = orientation;
        this.zzc = i;
        this.zzd = i2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = list;
        this.zzh = zzptVar;
        this.zzi = list2;
        this.zzj = function1;
        this.zzk = kotlin.collections.CollectionsKt.emptyList();
    }

    static /* synthetic */ void zzh(com.google.android.libraries.places.internal.zzqd zzqdVar, com.google.android.libraries.places.internal.zzqc zzqcVar, java.lang.String str, int i, com.google.android.libraries.places.widget.internal.placedetails.zzas zzasVar) {
        boolean z = zzqdVar.zzb == com.google.android.libraries.places.widget.model.Orientation.VERTICAL || ((int) (((float) zzqcVar.itemView.getWidth()) / zzqcVar.itemView.getContext().getResources().getDisplayMetrics().density)) > 350;
        if (str != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "place-image")) {
                zzasVar.zzc((com.google.android.libraries.places.widget.internal.placedetails.zzbq) zzqdVar.zzk.get(i), z, zzqdVar.zzk.size() > 0, false, 0);
            }
        } else if (zzqdVar.zzk.size() > i) {
            zzasVar.zzc((com.google.android.libraries.places.widget.internal.placedetails.zzbq) zzqdVar.zzk.get(i), z, zzqdVar.zzk.size() > 0 && zzqdVar.zzi.contains(com.google.android.libraries.places.internal.zzpx.zza), false, 0);
        } else if (z && zzqdVar.zzi.contains(com.google.android.libraries.places.internal.zzpx.zza)) {
            ((android.widget.ImageView) zzqcVar.itemView.findViewById(com.google.android.libraries.places.R.id.place_image)).setVisibility(0);
            zzqcVar.itemView.findViewById(com.google.android.libraries.places.R.id.place_image_container).setVisibility(0);
            zzasVar.zzc(com.google.android.libraries.places.widget.internal.placedetails.zzbn.zza, true, true, false, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zzg.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View inflate = this.zzb == com.google.android.libraries.places.widget.model.Orientation.HORIZONTAL ? android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.libraries.places.R.layout.place_details_compact_horizontal_fragment, viewGroup, false) : android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.libraries.places.R.layout.place_details_compact_vertical_fragment, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(inflate);
        return new com.google.android.libraries.places.internal.zzqc(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(com.google.android.libraries.places.internal.zzqc zzqcVar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzqcVar, "");
        onBindViewHolder(zzqcVar, i, kotlin.collections.CollectionsKt.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(final com.google.android.libraries.places.internal.zzqc zzqcVar, final int i, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzqcVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        android.view.View view = zzqcVar.itemView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "");
        com.google.android.libraries.places.internal.zzpt zzptVar = this.zzh;
        kotlinx.coroutines.CoroutineScope coroutineScope = this.zza;
        int i2 = this.zzc;
        com.google.android.libraries.places.widget.model.Orientation orientation = this.zzb;
        final com.google.android.libraries.places.widget.internal.placedetails.zzas zzasVar = new com.google.android.libraries.places.widget.internal.placedetails.zzas(view, zzptVar, coroutineScope, i2, orientation);
        android.view.View view2 = zzqcVar.itemView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "");
        android.content.Context context = zzqcVar.itemView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        com.google.android.libraries.places.widget.internal.placedetails.zzad zzadVar = new com.google.android.libraries.places.widget.internal.placedetails.zzad(view2, context, i2, zzptVar != null ? zzptVar.zzb() : null, com.google.android.libraries.places.widget.internal.placedetails.zzab.zzc);
        java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) list);
        final java.lang.String str = firstOrNull instanceof java.lang.String ? (java.lang.String) firstOrNull : null;
        if (str == null) {
            if (orientation == com.google.android.libraries.places.widget.model.Orientation.HORIZONTAL) {
                zzqcVar.zza();
            } else {
                zzqcVar.zzb();
            }
            zzqcVar.itemView.findViewById(com.google.android.libraries.places.R.id.loading_indicator).setVisibility(8);
            zzqcVar.itemView.findViewById(com.google.android.libraries.places.R.id.loading_failed_message).setVisibility(8);
            zzasVar.zza();
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (zzqcVar.itemView.getContext().getTheme().resolveAttribute(com.google.android.libraries.places.R.attr.placesTextAppearanceTitleMedium, typedValue, true)) {
                androidx.core.widget.TextViewCompat.setTextAppearance((android.widget.TextView) zzqcVar.itemView.findViewById(com.google.android.libraries.places.R.id.place_name), typedValue.resourceId);
            }
            java.util.List list2 = this.zzg;
            com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) list2.get(i);
            boolean z = this.zzf;
            java.util.List list3 = this.zzi;
            zzasVar.zzb(place, z, list3.contains(com.google.android.libraries.places.internal.zzpx.zzb));
            zzadVar.zza((com.google.android.libraries.places.api.model.Place) list2.get(i), list3.contains(com.google.android.libraries.places.internal.zzpx.zzc), list3.contains(com.google.android.libraries.places.internal.zzpx.zze), list3.contains(com.google.android.libraries.places.internal.zzpx.zzd), list3.contains(com.google.android.libraries.places.internal.zzpx.zzf), list3.contains(com.google.android.libraries.places.internal.zzpx.zzg), null);
            zzadVar.zzb((com.google.android.libraries.places.api.model.Place) list2.get(i), null);
        }
        zzqcVar.itemView.post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzpy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzqd.zzh(com.google.android.libraries.places.internal.zzqd.this, zzqcVar, str, i, zzasVar);
            }
        });
    }

    public final void zzc(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zzk = list;
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            notifyItemChanged(i, "place-image");
        }
    }
}
