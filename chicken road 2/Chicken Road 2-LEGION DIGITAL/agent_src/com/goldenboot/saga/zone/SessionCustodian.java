package com.goldenboot.saga.zone;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/goldenboot/saga/zone/SessionCustodian;", "Lcom/goldenboot/saga/zone/LayoutAdapter;", "<init>", "()V", "Lcom/goldenboot/saga/zone/ClientTranslator;", "params", "Landroid/text/StaticLayout;", "evictLayout", "(Lcom/goldenboot/saga/zone/ClientTranslator;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "growPayload", "(Landroid/text/StaticLayout;Z)Z", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SessionCustodian implements LayoutAdapter {
    @Override // com.goldenboot.saga.zone.LayoutAdapter
    public StaticLayout evictLayout(ClientTranslator params) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        obtain.setTextDirection(params.getTextDir());
        obtain.setAlignment(params.getAlignment());
        obtain.setMaxLines(params.getMaxLines());
        obtain.setEllipsize(params.getEllipsize());
        obtain.setEllipsizedWidth(params.getEllipsizedWidth());
        obtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        obtain.setIncludePad(params.getIncludePadding());
        obtain.setBreakStrategy(params.getBreakStrategy());
        obtain.setHyphenationFrequency(params.getHyphenationFrequency());
        obtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i = Build.VERSION.SDK_INT;
        PooledRecovery.evictLayout(obtain, params.getJustificationMode());
        RemoteWorkflow.evictLayout(obtain, params.getUseFallbackLineSpacing());
        if (i >= 33) {
            PanelSupervisor.growPayload(obtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        if (i >= 35) {
            LegacyManager.evictLayout(obtain);
        }
        return obtain.build();
    }

    @Override // com.goldenboot.saga.zone.LayoutAdapter
    public boolean growPayload(StaticLayout layout, boolean useFallbackLineSpacing) {
        return Build.VERSION.SDK_INT >= 33 ? PanelSupervisor.evictLayout(layout) : useFallbackLineSpacing;
    }
}
