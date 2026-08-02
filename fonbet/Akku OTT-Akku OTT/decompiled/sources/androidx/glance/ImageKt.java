package androidx.glance;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.ContentScale;
import androidx.glance.semantics.SemanticsConfiguration;
import androidx.glance.semantics.SemanticsModifier;
import androidx.glance.semantics.SemanticsModifierKt;
import androidx.glance.semantics.SemanticsProperties;
import androidx.glance.semantics.SemanticsPropertiesKt;
import androidx.glance.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Image", "", "provider", "Landroidx/glance/ImageProvider;", "contentDescription", "", "modifier", "Landroidx/glance/GlanceModifier;", "contentScale", "Landroidx/glance/layout/ContentScale;", "colorFilter", "Landroidx/glance/ColorFilter;", "Image-GCr5PR4", "(Landroidx/glance/ImageProvider;Ljava/lang/String;Landroidx/glance/GlanceModifier;ILandroidx/glance/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "ImageProvider", "bitmap", "Landroid/graphics/Bitmap;", "icon", "Landroid/graphics/drawable/Icon;", "resId", "", "isDecorative", "", "Landroidx/glance/EmittableImage;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/glance/ImageKt\n+ 2 Utils.kt\nandroidx/glance/UtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 GlanceNode.kt\nandroidx/glance/GlanceNodeKt\n*L\n1#1,178:1\n23#2,7:179\n36#3:186\n251#3,10:194\n1057#4,6:187\n34#5:193\n35#5:204\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/glance/ImageKt\n*L\n132#1:179,7\n161#1:186\n168#1:194,10\n161#1:187,6\n168#1:193\n168#1:204\n*E\n"})
/* loaded from: classes.dex */
public final class ImageKt {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    @Composable
    /* renamed from: Image-GCr5PR4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1276ImageGCr5PR4(final ImageProvider imageProvider, final String str, GlanceModifier glanceModifier, int i, ColorFilter colorFilter, Composer composer, final int i2, final int i3) {
        int i4;
        ColorFilter colorFilter2;
        final GlanceModifier glanceModifier2;
        final int m1401getFitAe3V0ko;
        GlanceModifier glanceModifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(491792371);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(imageProvider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(glanceModifier) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            colorFilter2 = colorFilter;
            i4 |= startRestartGroup.changed(colorFilter2) ? 16384 : 8192;
            if ((46811 & i4) == 9362 || !startRestartGroup.getSkipping()) {
                glanceModifier2 = i5 == 0 ? GlanceModifier.INSTANCE : glanceModifier;
                m1401getFitAe3V0ko = i6 == 0 ? ContentScale.INSTANCE.m1401getFitAe3V0ko() : i;
                if (i7 != 0) {
                    colorFilter2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(491792371, i4, -1, "androidx.glance.Image (Image.kt:152)");
                }
                startRestartGroup.startReplaceableGroup(-2073834891);
                if (str == null) {
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(str);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.glance.ImageKt$Image$finalModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    glanceModifier3 = SemanticsModifierKt.semantics(glanceModifier2, (Function1) rememberedValue);
                } else {
                    glanceModifier3 = glanceModifier2;
                }
                startRestartGroup.endReplaceableGroup();
                ImageKt$Image$1 imageKt$Image$1 = ImageKt$Image$1.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1115894518);
                startRestartGroup.startReplaceableGroup(1886828752);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(imageKt$Image$1));
                }
                Composer m108constructorimpl = Updater.m108constructorimpl(startRestartGroup);
                Updater.m115setimpl(m108constructorimpl, imageProvider, new Function2<EmittableImage, ImageProvider, Unit>() { // from class: androidx.glance.ImageKt$Image$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, ImageProvider imageProvider2) {
                        invoke2(emittableImage, imageProvider2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EmittableImage emittableImage, ImageProvider imageProvider2) {
                        emittableImage.setProvider(imageProvider2);
                    }
                });
                Updater.m115setimpl(m108constructorimpl, glanceModifier3, new Function2<EmittableImage, GlanceModifier, Unit>() { // from class: androidx.glance.ImageKt$Image$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, GlanceModifier glanceModifier4) {
                        invoke2(emittableImage, glanceModifier4);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EmittableImage emittableImage, GlanceModifier glanceModifier4) {
                        emittableImage.setModifier(glanceModifier4);
                    }
                });
                Updater.m115setimpl(m108constructorimpl, ContentScale.m1392boximpl(m1401getFitAe3V0ko), new Function2<EmittableImage, ContentScale, Unit>() { // from class: androidx.glance.ImageKt$Image$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, ContentScale contentScale) {
                        m1277invoke5YttGEI(emittableImage, contentScale.getValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-5YttGEI, reason: not valid java name */
                    public final void m1277invoke5YttGEI(EmittableImage emittableImage, int i8) {
                        emittableImage.m1275setContentScaleHwT0Evw(i8);
                    }
                });
                Updater.m115setimpl(m108constructorimpl, colorFilter2, new Function2<EmittableImage, ColorFilter, Unit>() { // from class: androidx.glance.ImageKt$Image$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, ColorFilter colorFilter3) {
                        invoke2(emittableImage, colorFilter3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EmittableImage emittableImage, ColorFilter colorFilter3) {
                        emittableImage.setColorFilterParams(colorFilter3 != null ? colorFilter3.getColorFilterParams() : null);
                    }
                });
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                glanceModifier2 = glanceModifier;
                m1401getFitAe3V0ko = i;
            }
            final ColorFilter colorFilter3 = colorFilter2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.ImageKt$Image$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ImageKt.m1276ImageGCr5PR4(ImageProvider.this, str, glanceModifier2, m1401getFitAe3V0ko, colorFilter3, composer2, i2 | 1, i3);
                }
            });
            return;
        }
        colorFilter2 = colorFilter;
        if ((46811 & i4) == 9362) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-2073834891);
        if (str == null) {
        }
        startRestartGroup.endReplaceableGroup();
        ImageKt$Image$1 imageKt$Image$12 = ImageKt$Image$1.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1115894518);
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
        }
        Composer m108constructorimpl2 = Updater.m108constructorimpl(startRestartGroup);
        Updater.m115setimpl(m108constructorimpl2, imageProvider, new Function2<EmittableImage, ImageProvider, Unit>() { // from class: androidx.glance.ImageKt$Image$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, ImageProvider imageProvider2) {
                invoke2(emittableImage, imageProvider2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableImage emittableImage, ImageProvider imageProvider2) {
                emittableImage.setProvider(imageProvider2);
            }
        });
        Updater.m115setimpl(m108constructorimpl2, glanceModifier3, new Function2<EmittableImage, GlanceModifier, Unit>() { // from class: androidx.glance.ImageKt$Image$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, GlanceModifier glanceModifier4) {
                invoke2(emittableImage, glanceModifier4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableImage emittableImage, GlanceModifier glanceModifier4) {
                emittableImage.setModifier(glanceModifier4);
            }
        });
        Updater.m115setimpl(m108constructorimpl2, ContentScale.m1392boximpl(m1401getFitAe3V0ko), new Function2<EmittableImage, ContentScale, Unit>() { // from class: androidx.glance.ImageKt$Image$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, ContentScale contentScale) {
                m1277invoke5YttGEI(emittableImage, contentScale.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-5YttGEI, reason: not valid java name */
            public final void m1277invoke5YttGEI(EmittableImage emittableImage, int i8) {
                emittableImage.m1275setContentScaleHwT0Evw(i8);
            }
        });
        Updater.m115setimpl(m108constructorimpl2, colorFilter2, new Function2<EmittableImage, ColorFilter, Unit>() { // from class: androidx.glance.ImageKt$Image$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(EmittableImage emittableImage, ColorFilter colorFilter32) {
                invoke2(emittableImage, colorFilter32);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EmittableImage emittableImage, ColorFilter colorFilter32) {
                emittableImage.setColorFilterParams(colorFilter32 != null ? colorFilter32.getColorFilterParams() : null);
            }
        });
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        final ColorFilter colorFilter32 = colorFilter2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ImageProvider ImageProvider(@DrawableRes int i) {
        return new AndroidResourceImageProvider(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean isDecorative(EmittableImage emittableImage) {
        List list;
        String str = null;
        SemanticsModifier semanticsModifier = (SemanticsModifier) emittableImage.getModifier().foldIn(null, new Function2<SemanticsModifier, GlanceModifier.Element, SemanticsModifier>() { // from class: androidx.glance.ImageKt$isDecorative$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final SemanticsModifier invoke(SemanticsModifier semanticsModifier2, GlanceModifier.Element element) {
                return element instanceof SemanticsModifier ? element : semanticsModifier2;
            }
        });
        SemanticsConfiguration configuration = semanticsModifier != null ? semanticsModifier.getConfiguration() : null;
        if (configuration != null && (list = (List) configuration.getOrNull(SemanticsProperties.INSTANCE.getContentDescription())) != null) {
            str = (String) list.get(0);
        }
        return str == null || str.length() == 0;
    }

    public static final ImageProvider ImageProvider(Bitmap bitmap) {
        return new BitmapImageProvider(bitmap);
    }

    @RequiresApi(23)
    public static final ImageProvider ImageProvider(Icon icon) {
        return new IconImageProvider(icon);
    }
}
