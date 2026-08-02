package b2;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import f1.AbstractC1940b;
import g1.C1969c;
import java.util.ArrayList;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0509a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7214a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f7215b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7216c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f7217d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7218e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f7219g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f7220h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f7221j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f7222k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03a8, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03b3, code lost:
    
        if (r1 >= r3) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b5, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03c3, code lost:
    
        if (r33 != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c5, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03c9, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03a4, code lost:
    
        if (r32 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a6, code lost:
    
        if (r10 == null) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0380  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i5) {
        int i6;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        int i11;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i12;
        String str2;
        Keyframe ofFloat;
        Resources.Theme theme2;
        int i13;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlResourceParser xmlResourceParser2;
        ValueAnimator valueAnimator;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i14 = 0;
            int i15 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i16 = 1;
            if (next == 1) {
                break;
            }
            int i17 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else {
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray f5 = AbstractC1940b.f(resources3, theme3, attributeSet, f7220h);
                        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i13 = f5.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlResourceParser2 = xmlResourceParser;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i13 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlResourceParser2 = xmlResourceParser;
                        }
                        a(context, resources2, theme2, xmlResourceParser2, attributeSet3, animatorSet2, i13);
                        valueAnimator2 = animatorSet2;
                        f5.recycle();
                        i6 = depth;
                        if (animatorSet != null && i14 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i6;
                    } else {
                        String str3 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                        }
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i15 || eventType == i16) {
                                break;
                            }
                            if (eventType != i17) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals(str3)) {
                                    TypedArray f6 = AbstractC1940b.f(resources3, theme3, asAttributeSet, i);
                                    String b3 = AbstractC1940b.b(f6, xmlResourceParser, "propertyName", i15);
                                    int i18 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : f6.getInt(i17, 4);
                                    attributeSet2 = asAttributeSet;
                                    int i19 = i18;
                                    i8 = i17;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        i9 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = f7221j;
                                            str2 = str3;
                                            if (i19 == 4) {
                                                TypedArray f7 = AbstractC1940b.f(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                TypedValue peekValue = !AbstractC1940b.c(xmlResourceParser, "value") ? null : f7.peekValue(0);
                                                int i20 = (peekValue == null || !c(peekValue.type)) ? 0 : 3;
                                                f7.recycle();
                                                i19 = i20;
                                            }
                                            TypedArray f8 = AbstractC1940b.f(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float f9 = AbstractC1940b.c(xmlResourceParser, "fraction") ? f8.getFloat(3, -1.0f) : -1.0f;
                                            TypedValue peekValue2 = !AbstractC1940b.c(xmlResourceParser, "value") ? null : f8.peekValue(0);
                                            boolean z3 = peekValue2 != null;
                                            int i21 = i19 == 4 ? (z3 && c(peekValue2.type)) ? 3 : 0 : i19;
                                            if (!z3) {
                                                ofFloat = i21 == 0 ? Keyframe.ofFloat(f9) : Keyframe.ofInt(f9);
                                            } else if (i21 == 0) {
                                                ofFloat = Keyframe.ofFloat(f9, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f8.getFloat(0, 0.0f) : 0.0f);
                                            } else if (i21 == 1 || i21 == 3) {
                                                ofFloat = Keyframe.ofInt(f9, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f8.getInt(0, 0) : 0);
                                            } else {
                                                ofFloat = null;
                                            }
                                            int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f8.getResourceId(1, 0) : 0;
                                            if (resourceId > 0) {
                                                ofFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            f8.recycle();
                                            if (ofFloat != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(ofFloat);
                                            }
                                            xmlResourceParser.next();
                                        } else {
                                            str2 = str3;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i9;
                                        str3 = str2;
                                    }
                                    str = str3;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        i11 = 3;
                                        propertyValuesHolder = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        int i22 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                i22++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                i22++;
                                            }
                                        }
                                        int i23 = i22;
                                        Keyframe[] keyframeArr = new Keyframe[i23];
                                        arrayList3.toArray(keyframeArr);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            Keyframe keyframe3 = keyframeArr[i24];
                                            if (keyframe3.getFraction() < 0.0f) {
                                                if (i24 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    int i25 = i23 - 1;
                                                    if (i24 == i25) {
                                                        keyframe3.setFraction(1.0f);
                                                        i12 = i23;
                                                    } else {
                                                        int i26 = i24;
                                                        for (int i27 = i24 + 1; i27 < i25 && keyframeArr[i27].getFraction() < 0.0f; i27++) {
                                                            i26 = i27;
                                                        }
                                                        float fraction3 = (keyframeArr[i26 + 1].getFraction() - keyframeArr[i24 - 1].getFraction()) / ((i26 - i24) + 2);
                                                        int i28 = i24;
                                                        while (i28 <= i26) {
                                                            float f10 = fraction3;
                                                            keyframeArr[i28].setFraction(keyframeArr[i28 - 1].getFraction() + f10);
                                                            i28++;
                                                            i23 = i23;
                                                            fraction3 = f10;
                                                        }
                                                        i12 = i23;
                                                    }
                                                    i24++;
                                                    i23 = i12;
                                                }
                                            }
                                            i12 = i23;
                                            i24++;
                                            i23 = i12;
                                        }
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b3, keyframeArr);
                                        i11 = 3;
                                        if (i19 == 3) {
                                            propertyValuesHolder.setEvaluator(f.f7232a);
                                        }
                                    }
                                    i10 = 0;
                                    i7 = 1;
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = b(f6, i18, 0, 1, b3);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolder);
                                    }
                                    f6.recycle();
                                } else {
                                    attributeSet2 = asAttributeSet;
                                    i7 = i16;
                                    i8 = i17;
                                    i9 = depth;
                                    i10 = i14;
                                    str = str3;
                                    i11 = i15;
                                }
                                xmlResourceParser.next();
                                resources3 = resources;
                                i14 = i10;
                                i16 = i7;
                                i15 = i11;
                                i17 = i8;
                                asAttributeSet = attributeSet2;
                                depth = i9;
                                str3 = str;
                                theme3 = theme;
                            }
                        }
                        int i29 = i16;
                        i6 = depth;
                        int i30 = i14;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i31 = i30; i31 < size2; i31++) {
                                propertyValuesHolderArr[i31] = (PropertyValuesHolder) arrayList2.get(i31);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator2 instanceof ValueAnimator)) {
                            valueAnimator2.setValues(propertyValuesHolderArr);
                        }
                        i14 = i29;
                        if (animatorSet != null) {
                            if (arrayList == null) {
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i6;
                    }
                }
                valueAnimator2 = valueAnimator;
                i6 = depth;
                if (animatorSet != null) {
                }
                depth = i6;
            }
        }
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i5, int i6, int i7, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i6);
        boolean z3 = peekValue != null;
        int i8 = z3 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i7);
        boolean z5 = peekValue2 != null;
        int i9 = z5 ? peekValue2.type : 0;
        if (i5 == 4) {
            i5 = ((z3 && c(i8)) || (z5 && c(i9))) ? 3 : 0;
        }
        boolean z6 = i5 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i5 == 2) {
            String string = typedArray.getString(i6);
            String string2 = typedArray.getString(i7);
            C1969c[] o5 = G4.d.o(string);
            C1969c[] o6 = G4.d.o(string2);
            if (o5 != null || o6 != null) {
                if (o5 != null) {
                    e eVar = new e();
                    if (o6 == null) {
                        return PropertyValuesHolder.ofObject(str, eVar, o5);
                    }
                    if (G4.d.j(o5, o6)) {
                        return PropertyValuesHolder.ofObject(str, eVar, o5, o6);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (o6 != null) {
                    return PropertyValuesHolder.ofObject(str, new e(), o6);
                }
            }
            return null;
        }
        f fVar = i5 == 3 ? f.f7232a : null;
        if (z6) {
            if (z3) {
                float dimension = i8 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f);
                if (z5) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z3) {
            int dimension2 = i8 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : c(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0);
            if (z5) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : c(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z5) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : c(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i5) {
        return i5 >= 28 && i5 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int i5 = 0;
        TypedArray f5 = AbstractC1940b.f(resources, theme, attributeSet, f7219g);
        TypedArray f6 = AbstractC1940b.f(resources, theme, attributeSet, f7222k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j5 = AbstractC1940b.c(xmlResourceParser, "duration") ? f5.getInt(1, 300) : 300;
        long j6 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : f5.getInt(2, 0);
        int i6 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : f5.getInt(7, 4);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i6 == 4) {
                TypedValue peekValue = f5.peekValue(5);
                boolean z3 = peekValue != null;
                int i7 = z3 ? peekValue.type : 0;
                TypedValue peekValue2 = f5.peekValue(6);
                boolean z5 = peekValue2 != null;
                i6 = ((z3 && c(i7)) || (z5 && c(z5 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b3 = b(f5, i6, 5, 6, "");
            if (b3 != null) {
                valueAnimator3.setValues(b3);
            }
        }
        valueAnimator3.setDuration(j5);
        valueAnimator3.setStartDelay(j6);
        valueAnimator3.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? f5.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? f5.getInt(4, 1) : 1);
        if (f6 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String b5 = AbstractC1940b.b(f6, xmlResourceParser, "pathData", 1);
            if (b5 != null) {
                String b6 = AbstractC1940b.b(f6, xmlResourceParser, "propertyXName", 2);
                String b7 = AbstractC1940b.b(f6, xmlResourceParser, "propertyYName", 3);
                if (i6 != 2) {
                }
                if (b6 == null && b7 == null) {
                    throw new InflateException(f6.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    C1969c.b(G4.d.o(b5), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f7 = 0.0f;
                    do {
                        f7 += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f7));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int min = Math.min(100, ((int) (f7 / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f8 = f7 / (min - 1);
                    valueAnimator = valueAnimator3;
                    int i8 = 0;
                    int i9 = 0;
                    float f9 = 0.0f;
                    while (true) {
                        if (i8 >= min) {
                            break;
                        }
                        int i10 = i8;
                        pathMeasure2.getPosTan(f9 - ((Float) arrayList.get(i9)).floatValue(), fArr3, null);
                        fArr[i10] = fArr3[0];
                        fArr2[i10] = fArr3[1];
                        int i11 = i9 + 1;
                        f9 += f8;
                        if (i11 < arrayList.size() && f9 > ((Float) arrayList.get(i11)).floatValue()) {
                            pathMeasure2.nextContour();
                            i9 = i11;
                        }
                        i8 = i10 + 1;
                    }
                    PropertyValuesHolder ofFloat = b6 != null ? PropertyValuesHolder.ofFloat(b6, fArr) : null;
                    PropertyValuesHolder ofFloat2 = b7 != null ? PropertyValuesHolder.ofFloat(b7, fArr2) : null;
                    if (ofFloat == null) {
                        objectAnimator2.setValues(ofFloat2);
                    } else if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                    i5 = 0;
                } catch (RuntimeException e3) {
                    throw new RuntimeException("Error in parsing ".concat(b5), e3);
                }
            } else {
                valueAnimator = valueAnimator3;
                objectAnimator2.setPropertyName(AbstractC1940b.b(f6, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i5 = f5.getResourceId(i5, i5);
        }
        if (i5 > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, i5));
        } else {
            valueAnimator2 = valueAnimator;
        }
        f5.recycle();
        if (f6 != null) {
            f6.recycle();
        }
        return valueAnimator2;
    }
}
