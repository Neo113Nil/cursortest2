package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R,\u0010.\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u00109\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R \u0010=\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010:8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\"\u0010>\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b>\u0010\u001c\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010?\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010A"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "<init>", "()V", "T", "key", "get", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "getOrElse", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "", "iterator", "()Ljava/util/Iterator;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "contains", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z", "containsImportantForAccessibility$ui", "()Z", "child", "mergeChild$ui", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "peer", "collapsePeer$ui", "copy", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/collection/MutableScatterMap;", "props", "Landroidx/collection/MutableScatterMap;", "getProps$ui", "()Landroidx/collection/MutableScatterMap;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableScatterSet;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableScatterSet;", "getHighSpeedVideoSizes", "Landroidx/collection/ScatterSet;", "getAccessibilityExtraKeys$ui", "()Landroidx/collection/ScatterSet;", "accessibilityExtraKeys", "isMergingSemanticsOfDescendants", "Z", "setMergingSemanticsOfDescendants", "(Z)V", "isClearingSemantics", "setClearingSemantics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements androidx.compose.ui.semantics.SemanticsPropertyReceiver, java.lang.Iterable<java.util.Map.Entry<? extends androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object>>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.collection.MutableScatterSet<androidx.compose.ui.semantics.SemanticsPropertyKey<?>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.Map<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private final androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> props = androidx.collection.ScatterMapKt.mutableScatterMapOf();

    public final androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> getProps$ui() {
        return this.props;
    }

    public final androidx.collection.ScatterSet<androidx.compose.ui.semantics.SemanticsPropertyKey<?>> getAccessibilityExtraKeys$ui() {
        return this.getHighSpeedVideoSizes;
    }

    public final <T> T get(androidx.compose.ui.semantics.SemanticsPropertyKey<T> key) {
        T t = (T) this.props.get(key);
        if (t != null) {
            return t;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Key not present: ");
        sb.append(key);
        sb.append(" - consider getOrElse or getOrNull");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public final <T> T getOrElse(androidx.compose.ui.semantics.SemanticsPropertyKey<T> key, kotlin.jvm.functions.Function0<? extends T> defaultValue) {
        T t = (T) this.props.get(key);
        return t == null ? defaultValue.invoke() : t;
    }

    public final <T> T getOrElseNullable(androidx.compose.ui.semantics.SemanticsPropertyKey<T> key, kotlin.jvm.functions.Function0<? extends T> defaultValue) {
        T t = (T) this.props.get(key);
        return t == null ? defaultValue.invoke() : t;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<? extends androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object>> iterator() {
        java.util.Map<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object> map = this.getHighResolutionOutputSizeshNQ4ISI;
        if (map == null) {
            map = this.props.asMap();
            this.getHighResolutionOutputSizeshNQ4ISI = map;
        }
        return map.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public final <T> void set(androidx.compose.ui.semantics.SemanticsPropertyKey<T> key, T value) {
        if ((value instanceof androidx.compose.ui.semantics.AccessibilityAction) && contains(key)) {
            java.lang.Object obj = this.props.get(key);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) obj;
            androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap = this.props;
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) value;
            java.lang.String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            kotlin.Function action = accessibilityAction2.getAction();
            if (action == null) {
                action = accessibilityAction.getAction();
            }
            mutableScatterMap.set(key, new androidx.compose.ui.semantics.AccessibilityAction(label, action));
        } else {
            this.props.set(key, value);
        }
        if (key.getAccessibilityExtraKey() != null) {
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = androidx.collection.ScatterSetKt.mutableScatterSetOf();
            }
            androidx.collection.MutableScatterSet<androidx.compose.ui.semantics.SemanticsPropertyKey<?>> mutableScatterSet = this.getHighSpeedVideoSizes;
            if (mutableScatterSet != null) {
                mutableScatterSet.add(key);
            }
        }
    }

    public final <T> boolean contains(androidx.compose.ui.semantics.SemanticsPropertyKey<T> key) {
        return this.props.containsKey(key);
    }

    public final boolean containsImportantForAccessibility$ui() {
        androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap = this.props;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            java.lang.Object obj = objArr[i4];
                            java.lang.Object obj2 = objArr2[i4];
                            if (((androidx.compose.ui.semantics.SemanticsPropertyKey) obj).getIsImportantForAccessibility()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: isMergingSemanticsOfDescendants, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }

    /* renamed from: isClearingSemantics, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void mergeChild$ui(androidx.compose.ui.semantics.SemanticsConfiguration child) {
        androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap = child.props;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        java.lang.Object obj2 = objArr2[i4];
                        androidx.compose.ui.semantics.SemanticsPropertyKey<?> semanticsPropertyKey = (androidx.compose.ui.semantics.SemanticsPropertyKey) obj;
                        java.lang.Object obj3 = this.props.get(semanticsPropertyKey);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(semanticsPropertyKey, "");
                        java.lang.Object merge = semanticsPropertyKey.merge(obj3, obj2);
                        if (merge != null) {
                            this.props.set(semanticsPropertyKey, merge);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void collapsePeer$ui(androidx.compose.ui.semantics.SemanticsConfiguration peer) {
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap = peer.props;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        java.lang.Object obj2 = objArr2[i4];
                        androidx.compose.ui.semantics.SemanticsPropertyKey<?> semanticsPropertyKey = (androidx.compose.ui.semantics.SemanticsPropertyKey) obj;
                        if (!this.props.contains(semanticsPropertyKey)) {
                            this.props.set(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof androidx.compose.ui.semantics.AccessibilityAction) {
                            java.lang.Object obj3 = this.props.get(semanticsPropertyKey);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
                            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) obj3;
                            androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap2 = this.props;
                            java.lang.String label = accessibilityAction.getLabel();
                            if (label == null) {
                                label = ((androidx.compose.ui.semantics.AccessibilityAction) obj2).getLabel();
                            }
                            java.lang.String str = label;
                            kotlin.Function action = accessibilityAction.getAction();
                            if (action == null) {
                                action = ((androidx.compose.ui.semantics.AccessibilityAction) obj2).getAction();
                            }
                            mutableScatterMap2.set(semanticsPropertyKey, new androidx.compose.ui.semantics.AccessibilityAction(str, action));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final androidx.compose.ui.semantics.SemanticsConfiguration copy() {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.putAll(this.props);
        return semanticsConfiguration;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.semantics.SemanticsConfiguration)) {
            return false;
        }
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = (androidx.compose.ui.semantics.SemanticsConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    public final int hashCode() {
        return (((this.props.hashCode() * 31) + java.lang.Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + java.lang.Boolean.hashCode(this.isClearingSemantics);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.isMergingSemanticsOfDescendants) {
            str = "";
        } else {
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> mutableScatterMap = this.props;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            java.lang.Object obj = objArr[i4];
                            java.lang.Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((androidx.compose.ui.semantics.SemanticsPropertyKey) obj).getName());
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(androidx.compose.ui.platform.JvmActuals_jvmKt.simpleIdentityToString(this, null));
        sb2.append("{ ");
        sb2.append((java.lang.Object) sb);
        sb2.append(" }");
        return sb2.toString();
    }
}
