package com.goldenboot.saga.zone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ScopeDrain {
    public static final ScaleMutator[] evictLayout = new ScaleMutator[0];

    public static final String detachStream(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final Set evictLayout(ScaleMutator scaleMutator) {
        Intrinsics.checkNotNullParameter(scaleMutator, "<this>");
        if (scaleMutator instanceof BounceStack) {
            return ((BounceStack) scaleMutator).growPayload();
        }
        HashSet hashSet = new HashSet(scaleMutator.detachStream());
        int detachStream = scaleMutator.detachStream();
        for (int i = 0; i < detachStream; i++) {
            hashSet.add(scaleMutator.releaseHeader(i));
        }
        return hashSet;
    }

    public static final ScaleMutator[] growPayload(List list) {
        ScaleMutator[] scaleMutatorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (scaleMutatorArr = (ScaleMutator[]) list.toArray(new ScaleMutator[0])) == null) ? evictLayout : scaleMutatorArr;
    }

    public static final String injectMetric(AccentSequence accentSequence) {
        Intrinsics.checkNotNullParameter(accentSequence, "<this>");
        String simpleName = accentSequence.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return detachStream(simpleName);
    }

    public static final Void releaseHeader(AccentSequence accentSequence) {
        Intrinsics.checkNotNullParameter(accentSequence, "<this>");
        throw new BreadcrumbHandler(injectMetric(accentSequence));
    }
}
