package com.goldenboot.saga.zone;

import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class TimelineGovernor {
    public static final ActivityMutator evictLayout = new ActivityMutator(null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TooltipUpgrade evictLayout(InputStream input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                TooltipUpgrade resumeSignature = TooltipUpgrade.resumeSignature(input);
                Intrinsics.checkNotNullExpressionValue(resumeSignature, "{\n                Prefer…From(input)\n            }");
                return resumeSignature;
            } catch (ContainerReceiver e) {
                throw new KeyframeRevision("Unable to parse preferences proto.", e);
            }
        }

        public ActivityMutator() {
        }
    }
}
