package androidx.core.graphics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u000b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000b\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000e\u0010\r\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u000f\u0010\t\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u000f\u0010\n\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u0010\u0010\t\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0010\u0010\n\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u0011\u0010\t\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0011\u0010\n\u001a-\u0010\u0016\u001a\u00020\u0014*\u00020\u00002\u0017\u0010\u0015\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "contains", "(Landroid/graphics/Region;Landroid/graphics/Point;)Z", "Landroid/graphics/Rect;", "r", "plus", "(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;", "minus", "unaryMinus", "(Landroid/graphics/Region;)Landroid/graphics/Region;", "not", "or", "and", "xor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "action", "forEach", "(Landroid/graphics/Region;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "(Landroid/graphics/Region;)Ljava/util/Iterator;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegionKt {
    public static final boolean contains(android.graphics.Region region, android.graphics.Point point) {
        return region.contains(point.x, point.y);
    }

    public static final android.graphics.Region plus(android.graphics.Region region, android.graphics.Rect rect) {
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.union(rect);
        return region2;
    }

    public static final android.graphics.Region plus(android.graphics.Region region, android.graphics.Region region2) {
        android.graphics.Region region3 = new android.graphics.Region(region);
        region3.op(region2, android.graphics.Region.Op.UNION);
        return region3;
    }

    public static final android.graphics.Region minus(android.graphics.Region region, android.graphics.Rect rect) {
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(rect, android.graphics.Region.Op.DIFFERENCE);
        return region2;
    }

    public static final android.graphics.Region minus(android.graphics.Region region, android.graphics.Region region2) {
        android.graphics.Region region3 = new android.graphics.Region(region);
        region3.op(region2, android.graphics.Region.Op.DIFFERENCE);
        return region3;
    }

    public static final android.graphics.Region unaryMinus(android.graphics.Region region) {
        android.graphics.Region region2 = new android.graphics.Region(region.getBounds());
        region2.op(region, android.graphics.Region.Op.DIFFERENCE);
        return region2;
    }

    public static final android.graphics.Region and(android.graphics.Region region, android.graphics.Rect rect) {
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(rect, android.graphics.Region.Op.INTERSECT);
        return region2;
    }

    public static final android.graphics.Region and(android.graphics.Region region, android.graphics.Region region2) {
        android.graphics.Region region3 = new android.graphics.Region(region);
        region3.op(region2, android.graphics.Region.Op.INTERSECT);
        return region3;
    }

    public static final android.graphics.Region xor(android.graphics.Region region, android.graphics.Rect rect) {
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(rect, android.graphics.Region.Op.XOR);
        return region2;
    }

    public static final android.graphics.Region xor(android.graphics.Region region, android.graphics.Region region2) {
        android.graphics.Region region3 = new android.graphics.Region(region);
        region3.op(region2, android.graphics.Region.Op.XOR);
        return region3;
    }

    public static final void forEach(android.graphics.Region region, kotlin.jvm.functions.Function1<? super android.graphics.Rect, kotlin.Unit> function1) {
        android.graphics.RegionIterator regionIterator = new android.graphics.RegionIterator(region);
        while (true) {
            android.graphics.Rect rect = new android.graphics.Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                function1.invoke(rect);
            }
        }
    }

    public static final java.util.Iterator<android.graphics.Rect> iterator(android.graphics.Region region) {
        return new androidx.core.graphics.RegionKt$iterator$1(region);
    }

    public static final android.graphics.Region not(android.graphics.Region region) {
        android.graphics.Region region2 = new android.graphics.Region(region.getBounds());
        region2.op(region, android.graphics.Region.Op.DIFFERENCE);
        return region2;
    }

    public static final android.graphics.Region or(android.graphics.Region region, android.graphics.Rect rect) {
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.union(rect);
        return region2;
    }

    public static final android.graphics.Region or(android.graphics.Region region, android.graphics.Region region2) {
        android.graphics.Region region3 = new android.graphics.Region(region);
        region3.op(region2, android.graphics.Region.Op.UNION);
        return region3;
    }
}
