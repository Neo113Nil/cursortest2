package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0004¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0006\u001a\u00028\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\u0082\u0001\u0004\u001f !\""}, d2 = {"Landroidx/constraintlayout/compose/BaseKeyFrameScope;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/NamedPropertyOrValue;", "E", "initialValue", "", "nameOverride", "Lkotlin/properties/ObservableProperty;", "addNameOnPropertyChange", "(Landroidx/constraintlayout/compose/NamedPropertyOrValue;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;", "T", "addOnPropertyChange", "(Ljava/lang/Object;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;", "Landroidx/constraintlayout/core/parser/CLContainer;", "container", "", "addToContainer$constraintlayout_compose_release", "(Landroidx/constraintlayout/core/parser/CLContainer;)V", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/constraintlayout/core/parser/CLContainer;Ljava/util/Map;)V", "", "customPropertiesValue", "Ljava/util/Map;", "getCustomPropertiesValue$constraintlayout_compose_release", "()Ljava/util/Map;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/constraintlayout/compose/FakeKeyFrameScope;", "Landroidx/constraintlayout/compose/KeyAttributeScope;", "Landroidx/constraintlayout/compose/KeyCycleScope;", "Landroidx/constraintlayout/compose/KeyPositionScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseKeyFrameScope {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.String, java.lang.Object> customPropertiesValue;

    private BaseKeyFrameScope() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        this.customPropertiesValue = new java.util.LinkedHashMap();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getCustomPropertiesValue$constraintlayout_compose_release() {
        return this.customPropertiesValue;
    }

    public static /* synthetic */ kotlin.properties.ObservableProperty addOnPropertyChange$default(androidx.constraintlayout.compose.BaseKeyFrameScope baseKeyFrameScope, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnPropertyChange");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return baseKeyFrameScope.addOnPropertyChange(obj, str);
    }

    protected final <T> kotlin.properties.ObservableProperty<T> addOnPropertyChange(final T initialValue, final java.lang.String nameOverride) {
        return new kotlin.properties.ObservableProperty<T>(initialValue) { // from class: androidx.constraintlayout.compose.BaseKeyFrameScope$addOnPropertyChange$1
            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(kotlin.reflect.KProperty<?> property, T oldValue, T newValue) {
                java.util.Map map;
                java.util.Map map2;
                if (newValue != null) {
                    map2 = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String str = nameOverride;
                    if (str == null) {
                        str = property.getName();
                    }
                    map2.put(str, newValue);
                    return;
                }
                map = this.getHighSpeedVideoFpsRangesFor;
                java.lang.String str2 = nameOverride;
                if (str2 == null) {
                    str2 = property.getName();
                }
                map.remove(str2);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ObservableProperty addNameOnPropertyChange$default(androidx.constraintlayout.compose.BaseKeyFrameScope baseKeyFrameScope, androidx.constraintlayout.compose.NamedPropertyOrValue namedPropertyOrValue, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNameOnPropertyChange");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return baseKeyFrameScope.addNameOnPropertyChange(namedPropertyOrValue, str);
    }

    protected final <E extends androidx.constraintlayout.compose.NamedPropertyOrValue> kotlin.properties.ObservableProperty<E> addNameOnPropertyChange(final E initialValue, final java.lang.String nameOverride) {
        return (kotlin.properties.ObservableProperty) new kotlin.properties.ObservableProperty<E>(initialValue) { // from class: androidx.constraintlayout.compose.BaseKeyFrameScope$addNameOnPropertyChange$1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Incorrect types in method signature: (Lkotlin/reflect/KProperty<*>;TE;TE;)V */
            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(kotlin.reflect.KProperty property, androidx.constraintlayout.compose.NamedPropertyOrValue oldValue, androidx.constraintlayout.compose.NamedPropertyOrValue newValue) {
                java.util.Map map;
                java.lang.String str = nameOverride;
                if (str == null) {
                    str = property.getName();
                }
                if (newValue != null) {
                    map = this.getHighSpeedVideoFpsRangesFor;
                    map.put(str, newValue.getName());
                }
            }
        };
    }

    public final void addToContainer$constraintlayout_compose_release(androidx.constraintlayout.core.parser.CLContainer container) {
        getHighResolutionOutputSizeshNQ4ISI(container, this.getHighSpeedVideoFpsRangesFor);
        androidx.constraintlayout.core.parser.CLObject objectOrNull = container.getObjectOrNull(io.reactivex.annotations.SchedulerSupport.CUSTOM);
        if (objectOrNull == null) {
            objectOrNull = new androidx.constraintlayout.core.parser.CLObject(new char[0]);
            container.put(io.reactivex.annotations.SchedulerSupport.CUSTOM, objectOrNull);
        }
        getHighResolutionOutputSizeshNQ4ISI(objectOrNull, this.customPropertiesValue);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.parser.CLContainer cLContainer, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            androidx.constraintlayout.core.parser.CLArray arrayOrCreate = cLContainer.getArrayOrCreate(key);
            if (value instanceof java.lang.String) {
                char[] charArray = ((java.lang.String) value).toCharArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "");
                androidx.constraintlayout.core.parser.CLString cLString = new androidx.constraintlayout.core.parser.CLString(charArray);
                cLString.setStart(0L);
                cLString.setEnd(charArray.length - 1);
                arrayOrCreate.add(cLString);
            } else if (value instanceof androidx.compose.ui.unit.Dp) {
                arrayOrCreate.add(new androidx.constraintlayout.core.parser.CLNumber(((androidx.compose.ui.unit.Dp) value).m8615unboximpl()));
            } else if (value instanceof java.lang.Number) {
                arrayOrCreate.add(new androidx.constraintlayout.core.parser.CLNumber(((java.lang.Number) value).floatValue()));
            }
        }
    }

    public /* synthetic */ BaseKeyFrameScope(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
