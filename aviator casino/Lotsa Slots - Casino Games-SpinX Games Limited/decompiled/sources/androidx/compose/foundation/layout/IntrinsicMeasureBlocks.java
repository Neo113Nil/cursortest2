package androidx.compose.foundation.layout;

/* compiled from: RowColumnImpl.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R/\u0010\u0003\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR/\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR/\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR/\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR/\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR/\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR/\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR/\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "()V", "HorizontalMaxHeight", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getHorizontalMaxHeight", "()Lkotlin/jvm/functions/Function3;", "HorizontalMaxWidth", "getHorizontalMaxWidth", "HorizontalMinHeight", "getHorizontalMinHeight", "HorizontalMinWidth", "getHorizontalMinWidth", "VerticalMaxHeight", "getVerticalMaxHeight", "VerticalMaxWidth", "getVerticalMaxWidth", "VerticalMinHeight", "getVerticalMinHeight", "VerticalMinWidth", "getVerticalMinWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks {
    public static final androidx.compose.foundation.layout.IntrinsicMeasureBlocks INSTANCE = new androidx.compose.foundation.layout.IntrinsicMeasureBlocks();
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMinWidth = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Horizontal, androidx.compose.foundation.layout.LayoutOrientation.Horizontal);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMinWidth = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Vertical, androidx.compose.foundation.layout.LayoutOrientation.Horizontal);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMinHeight = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Horizontal, androidx.compose.foundation.layout.LayoutOrientation.Vertical);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMinHeight = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Vertical, androidx.compose.foundation.layout.LayoutOrientation.Vertical);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMaxWidth = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Horizontal, androidx.compose.foundation.layout.LayoutOrientation.Horizontal);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMaxWidth = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Vertical, androidx.compose.foundation.layout.LayoutOrientation.Horizontal);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> HorizontalMaxHeight = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Horizontal, androidx.compose.foundation.layout.LayoutOrientation.Vertical);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };
    private static final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> VerticalMaxHeight = new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, java.lang.Integer num, java.lang.Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final java.lang.Integer invoke(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i, int i2) {
            int intrinsicSize;
            intrinsicSize = androidx.compose.foundation.layout.RowColumnImplKt.intrinsicSize(list, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            }, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i3) {
                    return java.lang.Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            }, i, i2, androidx.compose.foundation.layout.LayoutOrientation.Vertical, androidx.compose.foundation.layout.LayoutOrientation.Vertical);
            return java.lang.Integer.valueOf(intrinsicSize);
        }
    };

    private IntrinsicMeasureBlocks() {
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMinWidth() {
        return HorizontalMinWidth;
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMinWidth() {
        return VerticalMinWidth;
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMinHeight() {
        return HorizontalMinHeight;
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMinHeight() {
        return VerticalMinHeight;
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMaxWidth() {
        return HorizontalMaxWidth;
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMaxWidth() {
        return VerticalMaxWidth;
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getHorizontalMaxHeight() {
        return HorizontalMaxHeight;
    }

    public final kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>, java.lang.Integer, java.lang.Integer, java.lang.Integer> getVerticalMaxHeight() {
        return VerticalMaxHeight;
    }
}
