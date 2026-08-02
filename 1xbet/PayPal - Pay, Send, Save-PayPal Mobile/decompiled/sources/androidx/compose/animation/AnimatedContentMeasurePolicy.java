package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u001b\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "p0", "<init>", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {
    private final androidx.compose.animation.AnimatedContentTransitionScopeImpl<?> Camera2StreamConfigurationMap;

    public AnimatedContentMeasurePolicy(androidx.compose.animation.AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.Camera2StreamConfigurationMap = animatedContentTransitionScopeImpl;
    }

    public final androidx.compose.animation.AnimatedContentTransitionScopeImpl<?> getHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        int i;
        androidx.compose.ui.layout.Placeable placeable;
        final int width;
        int i2;
        androidx.compose.ui.layout.Placeable placeable2;
        final int height;
        int i3;
        int size = list.size();
        final androidx.compose.ui.layout.Placeable[] placeableArr = new androidx.compose.ui.layout.Placeable[size];
        long m8777getZeroYbymL2g = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= size2) {
                break;
            }
            androidx.compose.ui.layout.Measurable measurable = list.get(i4);
            java.lang.Object parentData = measurable.getParentData();
            androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData ? (androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData == null || !childData.isTarget()) {
                i3 = size2;
            } else {
                androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
                i3 = size2;
                long m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getHeight() & 4294967295L) | (mo7353measureBRTryo0.getWidth() << 32));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                placeableArr[i4] = mo7353measureBRTryo0;
                m8777getZeroYbymL2g = m8767constructorimpl;
            }
            i4++;
            size2 = i3;
        }
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            androidx.compose.ui.layout.Measurable measurable2 = list.get(i5);
            if (placeableArr[i5] == null) {
                placeableArr[i5] = measurable2.mo7353measureBRTryo0(j);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = (int) (m8777getZeroYbymL2g >> 32);
        } else {
            if (size == 0) {
                placeable = null;
            } else {
                placeable = placeableArr[0];
                int lastIndex = kotlin.collections.ArraysKt.getLastIndex(placeableArr);
                if (lastIndex != 0) {
                    int width2 = placeable != null ? placeable.getWidth() : 0;
                    if (lastIndex > 0) {
                        int i6 = 1;
                        while (true) {
                            androidx.compose.ui.layout.Placeable placeable3 = placeableArr[i6];
                            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                            if (width2 < width3) {
                                placeable = placeable3;
                                width2 = width3;
                            }
                            if (i6 == lastIndex) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
            width = placeable != null ? placeable.getWidth() : 0;
        }
        if (measureScope.isLookingAhead()) {
            height = (int) (m8777getZeroYbymL2g & 4294967295L);
        } else {
            if (size == 0) {
                i2 = 0;
                placeable2 = null;
            } else {
                i2 = 0;
                androidx.compose.ui.layout.Placeable placeable4 = placeableArr[0];
                int lastIndex2 = kotlin.collections.ArraysKt.getLastIndex(placeableArr);
                if (lastIndex2 != 0) {
                    int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                    if (lastIndex2 > 0) {
                        while (true) {
                            androidx.compose.ui.layout.Placeable placeable5 = placeableArr[i];
                            int height3 = placeable5 != null ? placeable5.getHeight() : 0;
                            if (height2 < height3) {
                                placeable4 = placeable5;
                                height2 = height3;
                            }
                            if (i == lastIndex2) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                placeable2 = placeable4;
            }
            height = placeable2 != null ? placeable2.getHeight() : i2;
        }
        if (!measureScope.isLookingAhead()) {
            this.Camera2StreamConfigurationMap.m1116setMeasuredSizeozmzZPI$animation(androidx.compose.ui.unit.IntSize.m8767constructorimpl((width << 32) | (height & 4294967295L)));
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoFpsRanges(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable[] placeableArr2;
                androidx.compose.ui.layout.Placeable[] placeableArr3 = placeableArr;
                androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i7 = width;
                int i8 = height;
                int length = placeableArr3.length;
                int i9 = 0;
                while (i9 < length) {
                    androidx.compose.ui.layout.Placeable placeable6 = placeableArr3[i9];
                    if (placeable6 != null) {
                        placeableArr2 = placeableArr3;
                        long mo5504alignKFBX0sM = animatedContentMeasurePolicy.getHighSpeedVideoFpsRangesFor().getGetHighSpeedVideoFpsRangesFor().mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.m8767constructorimpl((placeable6.getWidth() << 32) | (placeable6.getHeight() & 4294967295L)), androidx.compose.ui.unit.IntSize.m8767constructorimpl((i8 & 4294967295L) | (i7 << 32)), androidx.compose.ui.unit.LayoutDirection.Ltr);
                        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable6, androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo5504alignKFBX0sM), androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo5504alignKFBX0sM), 0.0f, 4, null);
                    } else {
                        placeableArr2 = placeableArr3;
                    }
                    i9++;
                    placeableArr3 = placeableArr2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(list.get(0).minIntrinsicWidth(i));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.get(i2).minIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(list.get(0).maxIntrinsicWidth(i));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.get(i2).maxIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        java.lang.Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
