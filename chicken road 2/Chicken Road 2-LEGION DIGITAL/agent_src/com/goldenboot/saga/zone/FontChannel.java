package com.goldenboot.saga.zone;

import android.os.Bundle;
import com.goldenboot.saga.zone.CompatInteractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class FontChannel implements CompatInteractor.BounceHandler {
    public final LayoutSynthesizer detachStream;
    public final CompatInteractor evictLayout;
    public boolean growPayload;
    public Bundle injectMetric;

    public FontChannel(CompatInteractor savedStateRegistry, final TypographyChannel viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.evictLayout = savedStateRegistry;
        this.detachStream = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.SequenceCounter
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                EmitterBenchmark clipOrigin;
                clipOrigin = FontChannel.clipOrigin(TypographyChannel.this);
                return clipOrigin;
            }
        });
    }

    public static final EmitterBenchmark clipOrigin(TypographyChannel typographyChannel) {
        return androidx.lifecycle.AlphaProbe.releaseHeader(typographyChannel);
    }

    public final EmitterBenchmark detachStream() {
        return (EmitterBenchmark) this.detachStream.getValue();
    }

    @Override // com.goldenboot.saga.zone.CompatInteractor.BounceHandler
    public Bundle evictLayout() {
        AlarmFacilitator[] alarmFacilitatorArr;
        Map updateTimer = AttrConductor.updateTimer();
        if (updateTimer.isEmpty()) {
            alarmFacilitatorArr = new AlarmFacilitator[0];
        } else {
            ArrayList arrayList = new ArrayList(updateTimer.size());
            for (Map.Entry entry : updateTimer.entrySet()) {
                arrayList.add(PagerValidator.evictLayout((String) entry.getKey(), entry.getValue()));
            }
            alarmFacilitatorArr = (AlarmFacilitator[]) arrayList.toArray(new AlarmFacilitator[0]);
        }
        Bundle evictLayout = PaddingGenerator.evictLayout((AlarmFacilitator[]) Arrays.copyOf(alarmFacilitatorArr, alarmFacilitatorArr.length));
        Bundle evictLayout2 = ConsumerCurator.evictLayout(evictLayout);
        Bundle bundle = this.injectMetric;
        if (bundle != null) {
            ConsumerCurator.growPayload(evictLayout2, bundle);
        }
        for (Map.Entry entry2 : detachStream().updateTimer().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle evictLayout3 = ((androidx.lifecycle.FeatureStreamer) entry2.getValue()).growPayload().evictLayout();
            if (!PanelCounter.clipOrigin(PanelCounter.evictLayout(evictLayout3))) {
                ConsumerCurator.injectMetric(evictLayout2, str, evictLayout3);
            }
        }
        this.growPayload = false;
        return evictLayout;
    }

    public final Bundle injectMetric(String key) {
        AlarmFacilitator[] alarmFacilitatorArr;
        Intrinsics.checkNotNullParameter(key, "key");
        releaseHeader();
        Bundle bundle = this.injectMetric;
        if (bundle == null || !PanelCounter.growPayload(PanelCounter.evictLayout(bundle), key)) {
            return null;
        }
        Bundle detachStream = PanelCounter.detachStream(PanelCounter.evictLayout(bundle), key);
        if (detachStream == null) {
            Map updateTimer = AttrConductor.updateTimer();
            if (updateTimer.isEmpty()) {
                alarmFacilitatorArr = new AlarmFacilitator[0];
            } else {
                ArrayList arrayList = new ArrayList(updateTimer.size());
                for (Map.Entry entry : updateTimer.entrySet()) {
                    arrayList.add(PagerValidator.evictLayout((String) entry.getKey(), entry.getValue()));
                }
                alarmFacilitatorArr = (AlarmFacilitator[]) arrayList.toArray(new AlarmFacilitator[0]);
            }
            detachStream = PaddingGenerator.evictLayout((AlarmFacilitator[]) Arrays.copyOf(alarmFacilitatorArr, alarmFacilitatorArr.length));
            ConsumerCurator.evictLayout(detachStream);
        }
        ConsumerCurator.releaseHeader(ConsumerCurator.evictLayout(bundle), key);
        if (PanelCounter.clipOrigin(PanelCounter.evictLayout(bundle))) {
            this.injectMetric = null;
        }
        return detachStream;
    }

    public final void releaseHeader() {
        AlarmFacilitator[] alarmFacilitatorArr;
        if (this.growPayload) {
            return;
        }
        Bundle evictLayout = this.evictLayout.evictLayout("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map updateTimer = AttrConductor.updateTimer();
        if (updateTimer.isEmpty()) {
            alarmFacilitatorArr = new AlarmFacilitator[0];
        } else {
            ArrayList arrayList = new ArrayList(updateTimer.size());
            for (Map.Entry entry : updateTimer.entrySet()) {
                arrayList.add(PagerValidator.evictLayout((String) entry.getKey(), entry.getValue()));
            }
            alarmFacilitatorArr = (AlarmFacilitator[]) arrayList.toArray(new AlarmFacilitator[0]);
        }
        Bundle evictLayout2 = PaddingGenerator.evictLayout((AlarmFacilitator[]) Arrays.copyOf(alarmFacilitatorArr, alarmFacilitatorArr.length));
        Bundle evictLayout3 = ConsumerCurator.evictLayout(evictLayout2);
        Bundle bundle = this.injectMetric;
        if (bundle != null) {
            ConsumerCurator.growPayload(evictLayout3, bundle);
        }
        if (evictLayout != null) {
            ConsumerCurator.growPayload(evictLayout3, evictLayout);
        }
        this.injectMetric = evictLayout2;
        this.growPayload = true;
        detachStream();
    }
}
