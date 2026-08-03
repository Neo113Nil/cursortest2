package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback callback;
    private final android.content.Context context;
    private boolean isDisabled;
    private com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
    private boolean showDisableOption;
    private int themeResId;
    private final java.lang.CharSequence title;
    private java.util.Comparator<com.google.android.exoplayer2.Format> trackFormatComparator;
    private final java.util.List<com.google.android.exoplayer2.Tracks.Group> trackGroups;
    private com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider;

    public interface DialogCallback {
        void onTracksSelected(boolean z, java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(android.content.Context context, java.lang.CharSequence charSequence, java.util.List<com.google.android.exoplayer2.Tracks.Group> list, com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.trackGroups = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.callback = dialogCallback;
        this.overrides = com.google.common.collect.ImmutableMap.of();
    }

    public TrackSelectionDialogBuilder(android.content.Context context, java.lang.CharSequence charSequence, final com.google.android.exoplayer2.Player player, final int i) {
        this.context = context;
        this.title = charSequence;
        com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> groups = player.getCurrentTracks().getGroups();
        this.trackGroups = new java.util.ArrayList();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            com.google.android.exoplayer2.Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                this.trackGroups.add(group);
            }
        }
        this.overrides = player.getTrackSelectionParameters().overrides;
        this.callback = new com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback() { // from class: com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z, java.util.Map map) {
                com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.lambda$new$0(com.google.android.exoplayer2.Player.this, i, z, map);
            }
        };
    }

    static /* synthetic */ void lambda$new$0(com.google.android.exoplayer2.Player player, int i, boolean z, java.util.Map map) {
        com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder buildUpon = player.getTrackSelectionParameters().buildUpon();
        buildUpon.setTrackTypeDisabled(i, z);
        buildUpon.clearOverridesOfType(i);
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            buildUpon.addOverride((com.google.android.exoplayer2.trackselection.TrackSelectionOverride) it.next());
        }
        player.setTrackSelectionParameters(buildUpon.build());
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setTheme(int i) {
        this.themeResId = i;
        return this;
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setIsDisabled(boolean z) {
        this.isDisabled = z;
        return this;
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride) {
        java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> of;
        if (trackSelectionOverride == null) {
            of = java.util.Collections.emptyMap();
        } else {
            of = com.google.common.collect.ImmutableMap.of(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
        }
        return setOverrides(of);
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setOverrides(java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> map) {
        this.overrides = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map);
        return this;
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z) {
        this.allowAdaptiveSelections = z;
        return this;
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z) {
        this.allowMultipleOverrides = z;
        return this;
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setShowDisableOption(boolean z) {
        this.showDisableOption = z;
        return this;
    }

    public void setTrackFormatComparator(java.util.Comparator<com.google.android.exoplayer2.Format> comparator) {
        this.trackFormatComparator = comparator;
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setTrackNameProvider(com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }

    public android.app.Dialog build() {
        android.app.Dialog buildForAndroidX = buildForAndroidX();
        return buildForAndroidX == null ? buildForPlatform() : buildForAndroidX;
    }

    private android.app.Dialog buildForPlatform() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this.context, this.themeResId);
        android.view.View inflate = android.view.LayoutInflater.from(builder.getContext()).inflate(com.google.android.exoplayer2.ui.R.layout.exo_track_selection_dialog, (android.view.ViewGroup) null);
        return builder.setTitle(this.title).setView(inflate).setPositiveButton(android.R.string.ok, setUpDialogView(inflate)).setNegativeButton(android.R.string.cancel, (android.content.DialogInterface.OnClickListener) null).create();
    }

    private android.app.Dialog buildForAndroidX() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("androidx.appcompat.app.AlertDialog$Builder");
            java.lang.Object newInstance = cls.getConstructor(android.content.Context.class, java.lang.Integer.TYPE).newInstance(this.context, java.lang.Integer.valueOf(this.themeResId));
            android.view.View inflate = android.view.LayoutInflater.from((android.content.Context) cls.getMethod("getContext", new java.lang.Class[0]).invoke(newInstance, new java.lang.Object[0])).inflate(com.google.android.exoplayer2.ui.R.layout.exo_track_selection_dialog, (android.view.ViewGroup) null);
            android.content.DialogInterface.OnClickListener upDialogView = setUpDialogView(inflate);
            cls.getMethod("setTitle", java.lang.CharSequence.class).invoke(newInstance, this.title);
            cls.getMethod("setView", android.view.View.class).invoke(newInstance, inflate);
            cls.getMethod("setPositiveButton", java.lang.Integer.TYPE, android.content.DialogInterface.OnClickListener.class).invoke(newInstance, java.lang.Integer.valueOf(android.R.string.ok), upDialogView);
            cls.getMethod("setNegativeButton", java.lang.Integer.TYPE, android.content.DialogInterface.OnClickListener.class).invoke(newInstance, java.lang.Integer.valueOf(android.R.string.cancel), null);
            return (android.app.Dialog) cls.getMethod("create", new java.lang.Class[0]).invoke(newInstance, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private android.content.DialogInterface.OnClickListener setUpDialogView(android.view.View view) {
        final com.google.android.exoplayer2.ui.TrackSelectionView trackSelectionView = (com.google.android.exoplayer2.ui.TrackSelectionView) view.findViewById(com.google.android.exoplayer2.ui.R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.trackGroups, this.isDisabled, this.overrides, this.trackFormatComparator, null);
        return new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.this.m5464x1d103515(trackSelectionView, dialogInterface, i);
            }
        };
    }

    /* renamed from: lambda$setUpDialogView$1$com-google-android-exoplayer2-ui-TrackSelectionDialogBuilder, reason: not valid java name */
    /* synthetic */ void m5464x1d103515(com.google.android.exoplayer2.ui.TrackSelectionView trackSelectionView, android.content.DialogInterface dialogInterface, int i) {
        this.callback.onTracksSelected(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }
}
