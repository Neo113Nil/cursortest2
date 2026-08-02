package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceBuilder;", "", "<init>", "()V", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "trace", "()Ljava/util/List;", "", "p0", "Landroidx/compose/runtime/GroupSourceInformation;", "p1", "p2", "", "getHighSpeedVideoFpsRangesFor", "(ILandroidx/compose/runtime/GroupSourceInformation;Ljava/lang/Object;)V", "getHighResolutionOutputSizeshNQ4ISI", "(ILandroidx/compose/runtime/GroupSourceInformation;Ljava/lang/Object;)Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "getHighSpeedVideoSizes", "(Ljava/lang/Object;)Landroidx/compose/runtime/GroupSourceInformation;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/GroupSourceInformation;)Z", "groupKey", "objectKey", "sourceInformation", "childData", "processEdge", "(ILjava/lang/Object;Landroidx/compose/runtime/GroupSourceInformation;Ljava/lang/Object;)V", "(ILandroidx/compose/runtime/GroupSourceInformation;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "sourceInformationOf", "(Landroidx/compose/runtime/Anchor;)Landroidx/compose/runtime/GroupSourceInformation;", "groupKeyOf", "(Landroidx/compose/runtime/Anchor;)I", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ComposeStackTraceBuilder {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> getHighSpeedVideoSizes = new java.util.ArrayList();

    public abstract int groupKeyOf(androidx.compose.runtime.Anchor anchor);

    public abstract androidx.compose.runtime.GroupSourceInformation sourceInformationOf(androidx.compose.runtime.Anchor anchor);

    public final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> trace() {
        return this.getHighSpeedVideoSizes;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, androidx.compose.runtime.GroupSourceInformation p1, java.lang.Object p2) {
        this.getHighSpeedVideoSizes.add(getHighResolutionOutputSizeshNQ4ISI(p0, p1, p2));
    }

    private final androidx.compose.runtime.tooling.ComposeStackTraceFrame getHighResolutionOutputSizeshNQ4ISI(int p0, androidx.compose.runtime.GroupSourceInformation p1, java.lang.Object p2) {
        java.util.ArrayList<java.lang.Object> groups;
        java.lang.String sourceInformation;
        androidx.compose.runtime.tooling.SourceInformation parseSourceInformation = (p1 == null || (sourceInformation = p1.getSourceInformation()) == null) ? null : androidx.compose.runtime.tooling.SourceInformationKt.parseSourceInformation(sourceInformation);
        if (parseSourceInformation == null) {
            return new androidx.compose.runtime.tooling.ComposeStackTraceFrame(p0, null, null);
        }
        if (p2 == null) {
            return new androidx.compose.runtime.tooling.ComposeStackTraceFrame(p0, parseSourceInformation, null);
        }
        java.util.ArrayList<java.lang.Object> groups2 = p1.getGroups();
        int i = 0;
        if (groups2 != null) {
            int size = groups2.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                java.lang.Object obj = groups2.get(i3);
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, p2)) {
                    break;
                }
                androidx.compose.runtime.GroupSourceInformation highSpeedVideoSizes = getHighSpeedVideoSizes(obj);
                if (highSpeedVideoSizes != null && (highSpeedVideoSizes.getKey() == -127 || (highSpeedVideoSizes.getKey() == 0 && (obj instanceof androidx.compose.runtime.Anchor) && groupKeyOf((androidx.compose.runtime.Anchor) obj) == -127))) {
                    if ((highSpeedVideoSizes != null ? highSpeedVideoSizes.getSourceInformation() : null) == null) {
                        if (highSpeedVideoSizes != null && (groups = highSpeedVideoSizes.getGroups()) != null) {
                            java.util.ArrayList<java.lang.Object> arrayList = groups;
                            int size2 = arrayList.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                androidx.compose.runtime.GroupSourceInformation highSpeedVideoSizes2 = getHighSpeedVideoSizes(arrayList.get(i4));
                                if (highSpeedVideoSizes2 != null && Camera2StreamConfigurationMap(highSpeedVideoSizes2)) {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (highSpeedVideoSizes != null && Camera2StreamConfigurationMap(highSpeedVideoSizes)) {
                    i2++;
                }
            }
            i = i2;
        }
        return new androidx.compose.runtime.tooling.ComposeStackTraceFrame(p0, parseSourceInformation, java.lang.Integer.valueOf(i));
    }

    private final androidx.compose.runtime.GroupSourceInformation getHighSpeedVideoSizes(java.lang.Object p0) {
        if (p0 instanceof androidx.compose.runtime.Anchor) {
            return sourceInformationOf((androidx.compose.runtime.Anchor) p0);
        }
        if (p0 instanceof androidx.compose.runtime.GroupSourceInformation) {
            return (androidx.compose.runtime.GroupSourceInformation) p0;
        }
        throw new java.lang.IllegalStateException("Unexpected child source info ".concat(java.lang.String.valueOf(p0)).toString());
    }

    private static boolean Camera2StreamConfigurationMap(androidx.compose.runtime.GroupSourceInformation groupSourceInformation) {
        java.lang.String sourceInformation = groupSourceInformation.getSourceInformation();
        return sourceInformation != null && kotlin.text.StringsKt.startsWith$default(sourceInformation, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, false, 2, (java.lang.Object) null);
    }

    public final void processEdge(int groupKey, java.lang.Object objectKey, androidx.compose.runtime.GroupSourceInformation sourceInformation, java.lang.Object childData) {
        if (sourceInformation != null || kotlin.jvm.internal.Intrinsics.areEqual(objectKey, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
            if (childData == null || sourceInformation == null) {
                getHighSpeedVideoFpsRangesFor(groupKey, sourceInformation, null);
            } else {
                if (Camera2StreamConfigurationMap(groupKey, sourceInformation, childData) || sourceInformation.getClosed()) {
                    return;
                }
                getHighSpeedVideoFpsRangesFor(groupKey, sourceInformation, childData);
            }
        }
    }

    private final boolean Camera2StreamConfigurationMap(int p0, androidx.compose.runtime.GroupSourceInformation p1, java.lang.Object p2) {
        java.util.ArrayList<java.lang.Object> groups = p1.getGroups();
        boolean z = false;
        if (groups == null) {
            if (!p1.getClosed()) {
                getHighSpeedVideoFpsRangesFor(p0, p1, null);
                return true;
            }
            int dataStartOffset = p1.getDataStartOffset();
            int dataEndOffset = p1.getDataEndOffset();
            boolean z2 = p2 instanceof java.lang.Integer;
            if (z2) {
                java.lang.Number number = (java.lang.Number) p2;
                int intValue = number.intValue();
                if ((dataStartOffset <= intValue && intValue < dataEndOffset) || (dataStartOffset == dataEndOffset && z2 && dataStartOffset == number.intValue())) {
                    z = true;
                }
                if (z) {
                    getHighSpeedVideoFpsRangesFor(p1.getKey(), p1, null);
                    return true;
                }
            }
            return z;
        }
        java.util.ArrayList<java.lang.Object> arrayList = groups;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = arrayList.get(i);
            if (obj instanceof androidx.compose.runtime.Anchor) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, p2)) {
                    getHighSpeedVideoFpsRangesFor(p1.getKey(), p1, obj);
                    return true;
                }
            } else if (obj instanceof androidx.compose.runtime.GroupSourceInformation) {
                if (Camera2StreamConfigurationMap(p0, (androidx.compose.runtime.GroupSourceInformation) obj, p2)) {
                    getHighSpeedVideoFpsRangesFor(p1.getKey(), p1, obj);
                    return true;
                }
            } else {
                throw new java.lang.IllegalStateException("Unexpected child source info ".concat(java.lang.String.valueOf(obj)).toString());
            }
        }
        return false;
    }
}
