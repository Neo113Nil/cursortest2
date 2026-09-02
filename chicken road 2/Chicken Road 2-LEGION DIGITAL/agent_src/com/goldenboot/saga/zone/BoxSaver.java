package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a8\u0010!\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020#*\u00020\u0007H\u0003¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010&\u001a\u00020\u0000*\u00020\u0007H\u0007¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010(\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0004\b(\u0010)\u001a\"\u0010,\u001a\u00020\u0007*\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070*H\u0086\b¢\u0006\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020.8\u0000X\u0081T¢\u0006\f\n\u0004\b\b\u0010/\u0012\u0004\b0\u00101\"\u001f\u00108\u001a\u000203*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105\"\u001f\u0010;\u001a\u000203*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b:\u00107\u001a\u0004\b9\u00105¨\u0006<"}, d2 = {"", "red", "green", "blue", "alpha", "Lcom/goldenboot/saga/zone/InternalProvider;", "colorSpace", "Lcom/goldenboot/saga/zone/ContainerSource;", "evictLayout", "(FFFFLcom/goldenboot/saga/zone/InternalProvider;)J", "flushSample", "", "color", "growPayload", "(I)J", "", "detachStream", "(J)J", "injectMetric", "(IIII)J", "start", "stop", "fraction", "connectPatch", "(JJF)J", "background", "popBlueprint", "(JJ)J", "fgC", "bgC", "fgA", "bgA", "a", "applyTask", "(FFFFF)F", "", "drawField", "(J)[F", "attachConfig", "(J)F", "inflateAdapter", "(J)I", "Lkotlin/Function0;", "block", "resetDelta", "(JLcom/goldenboot/saga/zone/ElevationNode;)J", "Lcom/goldenboot/saga/zone/BoxSlot;", "J", "connectJob", "()V", "UnspecifiedColor", "", "peekRevision", "(J)Z", "serializeOffset", "(J)V", "isSpecified", "reduceScope", "notifyMessage", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoxSaver {
    public static final long evictLayout = 16;

    private static final float applyTask(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    public static final float attachConfig(long j) {
        InternalProvider injectConstraint = ContainerSource.injectConstraint(j);
        if (!SystemImpl.updateTimer(injectConstraint.getModel(), SystemImpl.INSTANCE.injectMetric())) {
            CellCycle.growPayload("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) SystemImpl.connectJob(injectConstraint.getModel())));
        }
        Intrinsics.checkNotNull(injectConstraint, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DragSerializer eotfFunc = ((SlideDeserializer) injectConstraint).getEotfFunc();
        float evictLayout2 = (float) ((eotfFunc.evictLayout(ContainerSource.queryModel(j)) * 0.2126d) + (eotfFunc.evictLayout(ContainerSource.filterPayload(j)) * 0.7152d) + (eotfFunc.evictLayout(ContainerSource.syncScope(j)) * 0.0722d));
        if (evictLayout2 < 0.0f) {
            evictLayout2 = 0.0f;
        }
        if (evictLayout2 > 1.0f) {
            return 1.0f;
        }
        return evictLayout2;
    }

    public static /* synthetic */ long clipOrigin(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = LayoutMap.flushSample;
        }
        return injectMetric(i, i2, i3, i4);
    }

    public static final long connectPatch(long j, long j2, float f) {
        InternalProvider inflateEdge = RegionPipe.evictLayout.inflateEdge();
        long purgeNode = ContainerSource.purgeNode(j, inflateEdge);
        long purgeNode2 = ContainerSource.purgeNode(j2, inflateEdge);
        float findTask = ContainerSource.findTask(purgeNode);
        float queryModel = ContainerSource.queryModel(purgeNode);
        float filterPayload = ContainerSource.filterPayload(purgeNode);
        float syncScope = ContainerSource.syncScope(purgeNode);
        float findTask2 = ContainerSource.findTask(purgeNode2);
        float queryModel2 = ContainerSource.queryModel(purgeNode2);
        float filterPayload2 = ContainerSource.filterPayload(purgeNode2);
        float syncScope2 = ContainerSource.syncScope(purgeNode2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return ContainerSource.purgeNode(flushSample(PlatformController.attachConfig(queryModel, queryModel2, f), PlatformController.attachConfig(filterPayload, filterPayload2, f), PlatformController.attachConfig(syncScope, syncScope2, f), PlatformController.attachConfig(findTask, findTask2, f), inflateEdge), ContainerSource.injectConstraint(j2));
    }

    public static final long detachStream(long j) {
        return ContainerSource.inflateAdapter(BoxSlot.evictLayout(j << 32));
    }

    private static final float[] drawField(long j) {
        return new float[]{ContainerSource.queryModel(j), ContainerSource.filterPayload(j), ContainerSource.syncScope(j), ContainerSource.findTask(j)};
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long evictLayout(float f, float f2, float f3, float f4, InternalProvider internalProvider) {
        int i;
        int i2;
        int i3;
        float clipOrigin;
        float releaseHeader;
        int i4;
        int i5;
        int i6;
        int i7;
        float clipOrigin2;
        float releaseHeader2;
        int i8;
        int i9;
        int i10;
        if (internalProvider.getIsSrgb()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            return ContainerSource.inflateAdapter(BoxSlot.evictLayout(BoxSlot.evictLayout(i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r5 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        if (!(internalProvider.injectMetric() == 3)) {
            CellCycle.growPayload("Color only works with ColorSpaces with 3 components");
        }
        int id = internalProvider.getId();
        if (!(id != -1)) {
            CellCycle.growPayload("Unknown color space, please use a color space in ColorSpaces");
        }
        float clipOrigin3 = internalProvider.clipOrigin(0);
        float releaseHeader3 = internalProvider.releaseHeader(0);
        if (f >= clipOrigin3) {
            clipOrigin3 = f;
        }
        if (clipOrigin3 <= releaseHeader3) {
            releaseHeader3 = clipOrigin3;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(releaseHeader3);
        int i14 = floatToRawIntBits >>> 31;
        int i15 = (floatToRawIntBits >>> 23) & LayoutMap.flushSample;
        int i16 = floatToRawIntBits & 8388607;
        if (i15 == 255) {
            i2 = i16 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i15 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i17 = i16 >> 13;
                if ((floatToRawIntBits & ContentOperation.TransformOrigin) != 0) {
                    i3 = (((i << 10) | i17) + 1) | (i14 << 15);
                    short s = (short) i3;
                    clipOrigin = internalProvider.clipOrigin(1);
                    releaseHeader = internalProvider.releaseHeader(1);
                    if (f2 >= clipOrigin) {
                        clipOrigin = f2;
                    }
                    if (clipOrigin <= releaseHeader) {
                        releaseHeader = clipOrigin;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(releaseHeader);
                    int i18 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & LayoutMap.flushSample;
                    int i19 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i19 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i20 = i19 >> 13;
                            if ((floatToRawIntBits2 & ContentOperation.TransformOrigin) != 0) {
                                i7 = (((i5 << 10) | i20) + 1) | (i18 << 15);
                                short s2 = (short) i7;
                                clipOrigin2 = internalProvider.clipOrigin(2);
                                releaseHeader2 = internalProvider.releaseHeader(2);
                                if (f3 >= clipOrigin2) {
                                    clipOrigin2 = f3;
                                }
                                if (clipOrigin2 <= releaseHeader2) {
                                    releaseHeader2 = clipOrigin2;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(releaseHeader2);
                                int i21 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & LayoutMap.flushSample;
                                int i22 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i22 != 0 ? 512 : 0;
                                    r8 = 31;
                                } else {
                                    int i23 = i8 - 112;
                                    if (i23 >= 31) {
                                        i9 = 0;
                                        r8 = 49;
                                    } else if (i23 > 0) {
                                        int i24 = i22 >> 13;
                                        if ((floatToRawIntBits3 & ContentOperation.TransformOrigin) != 0) {
                                            i10 = (((i23 << 10) | i24) + 1) | (i21 << 15);
                                            return ContainerSource.inflateAdapter(BoxSlot.evictLayout((id & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6)));
                                        }
                                        i9 = i24;
                                        r8 = i23;
                                    } else if (i23 >= -10) {
                                        int i25 = (i22 | 8388608) >> (1 - i23);
                                        if ((i25 & ContentOperation.TransformOrigin) != 0) {
                                            i25 += ContentOperation.Shape;
                                        }
                                        i9 = i25 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i21 << 15) | (r8 << 10);
                                if (f4 >= 0.0f) {
                                }
                                return ContainerSource.inflateAdapter(BoxSlot.evictLayout((id & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6)));
                            }
                            i6 = i20;
                        } else if (i5 >= -10) {
                            int i26 = (i19 | 8388608) >> (1 - i5);
                            if ((i26 & ContentOperation.TransformOrigin) != 0) {
                                i26 += ContentOperation.Shape;
                            }
                            i6 = i26 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i18 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    clipOrigin2 = internalProvider.clipOrigin(2);
                    releaseHeader2 = internalProvider.releaseHeader(2);
                    if (f3 >= clipOrigin2) {
                    }
                    if (clipOrigin2 <= releaseHeader2) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(releaseHeader2);
                    int i212 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & LayoutMap.flushSample;
                    int i222 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i212 << 15) | (r8 << 10);
                    if (f4 >= 0.0f) {
                    }
                    return ContainerSource.inflateAdapter(BoxSlot.evictLayout((id & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6)));
                }
                i2 = i17;
            } else if (i >= -10) {
                int i27 = (i16 | 8388608) >> (1 - i);
                if ((i27 & ContentOperation.TransformOrigin) != 0) {
                    i27 += ContentOperation.Shape;
                }
                i2 = i27 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i14 << 15) | (i << 10);
        short s3 = (short) i3;
        clipOrigin = internalProvider.clipOrigin(1);
        releaseHeader = internalProvider.releaseHeader(1);
        if (f2 >= clipOrigin) {
        }
        if (clipOrigin <= releaseHeader) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(releaseHeader);
        int i182 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & LayoutMap.flushSample;
        int i192 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i182 << 15) | (i5 << 10);
        short s222 = (short) i7;
        clipOrigin2 = internalProvider.clipOrigin(2);
        releaseHeader2 = internalProvider.releaseHeader(2);
        if (f3 >= clipOrigin2) {
        }
        if (clipOrigin2 <= releaseHeader2) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(releaseHeader2);
        int i2122 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & LayoutMap.flushSample;
        int i2222 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2122 << 15) | (r8 << 10);
        if (f4 >= 0.0f) {
        }
        return ContainerSource.inflateAdapter(BoxSlot.evictLayout((id & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long flushSample(float f, float f2, float f3, float f4, InternalProvider internalProvider) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (internalProvider.getIsSrgb()) {
            return ContainerSource.inflateAdapter(BoxSlot.evictLayout(BoxSlot.evictLayout((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32));
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & LayoutMap.flushSample;
        int i12 = floatToRawIntBits & 8388607;
        int i13 = 49;
        int i14 = ContentOperation.RotationY;
        int i15 = 0;
        if (i11 == 255) {
            i2 = i12 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i11 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i12 >> 13;
                if ((floatToRawIntBits & ContentOperation.TransformOrigin) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i10 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i17 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & LayoutMap.flushSample;
                    int i18 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((floatToRawIntBits2 & ContentOperation.TransformOrigin) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i20 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & LayoutMap.flushSample;
                                int i21 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    if (i21 == 0) {
                                        i14 = 0;
                                    }
                                    i15 = i14;
                                    i13 = 31;
                                } else {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((floatToRawIntBits3 & ContentOperation.TransformOrigin) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                                return ContainerSource.inflateAdapter(BoxSlot.evictLayout(((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (internalProvider.getId() & 63)));
                                            }
                                            i13 = i22;
                                        } else if (i22 >= -10) {
                                            int i23 = (i21 | 8388608) >> (1 - i22);
                                            if ((i23 & ContentOperation.TransformOrigin) != 0) {
                                                i23 += ContentOperation.Shape;
                                            }
                                            i13 = 0;
                                            i15 = i23 >> 13;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                }
                                i9 = (i20 << 15) | (i13 << 10) | i15;
                                return ContainerSource.inflateAdapter(BoxSlot.evictLayout(((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (internalProvider.getId() & 63)));
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i24 = (i18 | 8388608) >> (1 - i5);
                            if ((i24 & ContentOperation.TransformOrigin) != 0) {
                                i24 += ContentOperation.Shape;
                            }
                            i6 = i24 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i202 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & LayoutMap.flushSample;
                    int i212 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i202 << 15) | (i13 << 10) | i15;
                    return ContainerSource.inflateAdapter(BoxSlot.evictLayout(((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (internalProvider.getId() & 63)));
                }
                i2 = i16;
            } else if (i >= -10) {
                int i25 = (i12 | 8388608) >> (1 - i);
                if ((i25 & ContentOperation.TransformOrigin) != 0) {
                    i25 += ContentOperation.Shape;
                }
                i2 = i25 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i10 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i172 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & LayoutMap.flushSample;
        int i182 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i2022 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & LayoutMap.flushSample;
        int i2122 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i2022 << 15) | (i13 << 10) | i15;
        return ContainerSource.inflateAdapter(BoxSlot.evictLayout(((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (internalProvider.getId() & 63)));
    }

    public static final long growPayload(int i) {
        return ContainerSource.inflateAdapter(BoxSlot.evictLayout(BoxSlot.evictLayout(i) << 32));
    }

    public static final int inflateAdapter(long j) {
        return (int) BoxSlot.evictLayout(ContainerSource.purgeNode(j, RegionPipe.evictLayout.unlockMessage()) >>> 32);
    }

    public static final long injectMetric(int i, int i2, int i3, int i4) {
        return growPayload(((i & LayoutMap.flushSample) << 16) | ((i4 & LayoutMap.flushSample) << 24) | ((i2 & LayoutMap.flushSample) << 8) | (i3 & LayoutMap.flushSample));
    }

    public static final boolean peekRevision(long j) {
        return j != 16;
    }

    public static final long popBlueprint(long j, long j2) {
        long purgeNode = ContainerSource.purgeNode(j, ContainerSource.injectConstraint(j2));
        float findTask = ContainerSource.findTask(j2);
        float findTask2 = ContainerSource.findTask(purgeNode);
        float f = 1.0f - findTask2;
        float f2 = (findTask * f) + findTask2;
        return flushSample(f2 == 0.0f ? 0.0f : ((ContainerSource.queryModel(purgeNode) * findTask2) + ((ContainerSource.queryModel(j2) * findTask) * f)) / f2, f2 == 0.0f ? 0.0f : ((ContainerSource.filterPayload(purgeNode) * findTask2) + ((ContainerSource.filterPayload(j2) * findTask) * f)) / f2, f2 != 0.0f ? ((ContainerSource.syncScope(purgeNode) * findTask2) + ((ContainerSource.syncScope(j2) * findTask) * f)) / f2 : 0.0f, f2, ContainerSource.injectConstraint(j2));
    }

    public static final boolean reduceScope(long j) {
        return j == 16;
    }

    public static /* synthetic */ long releaseHeader(float f, float f2, float f3, float f4, InternalProvider internalProvider, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            internalProvider = RegionPipe.evictLayout.unlockMessage();
        }
        return evictLayout(f, f2, f3, f4, internalProvider);
    }

    public static final long resetDelta(long j, ElevationNode elevationNode) {
        return j != 16 ? j : ((ContainerSource) elevationNode.invoke()).getValue();
    }

    public static /* synthetic */ long updateTimer(float f, float f2, float f3, float f4, InternalProvider internalProvider, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            internalProvider = RegionPipe.evictLayout.unlockMessage();
        }
        return flushSample(f, f2, f3, f4, internalProvider);
    }

    public static /* synthetic */ void connectJob() {
    }

    public static /* synthetic */ void notifyMessage(long j) {
    }

    public static /* synthetic */ void serializeOffset(long j) {
    }
}
