package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.IconCreator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class StyleShaper {
    public static final DpadBuilder detachStream(AlphaInspector alphaInspector) {
        Intrinsics.checkNotNullParameter(alphaInspector, "<this>");
        return DpadBuilder.evictLayout;
    }

    public static final ScaleMutator growPayload(String serialName, TextValidator kind, ScaleMutator[] typeParameters, TouchRecord builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (CachedPropagator.groupArchive(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, IconCreator.ActivityMutator.evictLayout)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        AlphaInspector alphaInspector = new AlphaInspector(serialName);
        builder.invoke(alphaInspector);
        return new PanelInitializer(serialName, kind, alphaInspector.clipOrigin().size(), PluginInspector.formatMessage(typeParameters), alphaInspector);
    }

    public static /* synthetic */ ScaleMutator injectMetric(String str, TextValidator textValidator, ScaleMutator[] scaleMutatorArr, TouchRecord touchRecord, int i, Object obj) {
        if ((i & 8) != 0) {
            touchRecord = new TouchRecord() { // from class: com.goldenboot.saga.zone.AnchorListener
                @Override // com.goldenboot.saga.zone.TouchRecord
                public final Object invoke(Object obj2) {
                    DpadBuilder detachStream;
                    detachStream = StyleShaper.detachStream((AlphaInspector) obj2);
                    return detachStream;
                }
            };
        }
        return growPayload(str, textValidator, scaleMutatorArr, touchRecord);
    }
}
