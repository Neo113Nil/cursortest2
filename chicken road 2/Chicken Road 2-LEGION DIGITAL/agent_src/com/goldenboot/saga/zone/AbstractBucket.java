package com.goldenboot.saga.zone;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class AbstractBucket implements Iterable, Serializable {
    public static final Comparator attachConfig;
    public static final StylusConverter connectPatch;
    public static final AbstractBucket notifyMessage = new RestoreToggle(ProxyTask.detachStream);
    public int reduceScope = 0;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator extends FeedbackFlow {
        public final int notifyMessage;
        public int reduceScope = 0;

        public ActivityMutator() {
            this.notifyMessage = AbstractBucket.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.reduceScope < this.notifyMessage;
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.ScopedMigration
        public byte nextByte() {
            int i = this.reduceScope;
            if (i >= this.notifyMessage) {
                throw new NoSuchElementException();
            }
            this.reduceScope = i + 1;
            return AbstractBucket.this.peekRevision(i);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class BounceHandler implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractBucket abstractBucket, AbstractBucket abstractBucket2) {
            ScopedMigration it = abstractBucket.iterator();
            ScopedMigration it2 = abstractBucket2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(AbstractBucket.drawScope(it.nextByte())).compareTo(Integer.valueOf(AbstractBucket.drawScope(it2.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractBucket.size()).compareTo(Integer.valueOf(abstractBucket2.size()));
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends RestoreToggle {
        public final int inflateAdapter;
        public final int purgeNode;

        public EndpointList(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractBucket.clipOrigin(i, i + i2, bArr.length);
            this.inflateAdapter = i;
            this.purgeNode = i2;
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.RestoreToggle, com.goldenboot.saga.zone.AbstractBucket
        public void connectJob(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.resetDelta, inflateEdge() + i, bArr, i2, i3);
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.RestoreToggle, com.goldenboot.saga.zone.AbstractBucket
        public byte growPayload(int i) {
            AbstractBucket.releaseHeader(i, size());
            return this.resetDelta[this.inflateAdapter + i];
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.RestoreToggle
        public int inflateEdge() {
            return this.inflateAdapter;
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.RestoreToggle, com.goldenboot.saga.zone.AbstractBucket
        public byte peekRevision(int i) {
            return this.resetDelta[this.inflateAdapter + i];
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.RestoreToggle, com.goldenboot.saga.zone.AbstractBucket
        public int size() {
            return this.purgeNode;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static abstract class FeedbackFlow implements ScopedMigration {
        @Override // java.util.Iterator
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase implements StylusConverter {
        public LayerUseCase() {
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.StylusConverter
        public byte[] evictLayout(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ LayerUseCase(ActivityMutator activityMutator) {
            this();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class MorphDirector implements StylusConverter {
        public MorphDirector() {
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket.StylusConverter
        public byte[] evictLayout(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ MorphDirector(ActivityMutator activityMutator) {
            this();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static abstract class PluginInterpreter extends AbstractBucket {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class RestoreToggle extends PluginInterpreter {
        public final byte[] resetDelta;

        public RestoreToggle(byte[] bArr) {
            bArr.getClass();
            this.resetDelta = bArr;
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public void connectJob(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.resetDelta, i, bArr, i2, i3);
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractBucket) || size() != ((AbstractBucket) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof RestoreToggle)) {
                return obj.equals(this);
            }
            RestoreToggle restoreToggle = (RestoreToggle) obj;
            int attachConfig = attachConfig();
            int attachConfig2 = restoreToggle.attachConfig();
            if (attachConfig == 0 || attachConfig2 == 0 || attachConfig == attachConfig2) {
                return filterPayload(restoreToggle, 0, size());
            }
            return false;
        }

        public final boolean filterPayload(AbstractBucket abstractBucket, int i, int i2) {
            if (i2 > abstractBucket.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > abstractBucket.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abstractBucket.size());
            }
            if (!(abstractBucket instanceof RestoreToggle)) {
                return abstractBucket.inflateAdapter(i, i3).equals(inflateAdapter(0, i2));
            }
            RestoreToggle restoreToggle = (RestoreToggle) abstractBucket;
            byte[] bArr = this.resetDelta;
            byte[] bArr2 = restoreToggle.resetDelta;
            int inflateEdge = inflateEdge() + i2;
            int inflateEdge2 = inflateEdge();
            int inflateEdge3 = restoreToggle.inflateEdge() + i;
            while (inflateEdge2 < inflateEdge) {
                if (bArr[inflateEdge2] != bArr2[inflateEdge3]) {
                    return false;
                }
                inflateEdge2++;
                inflateEdge3++;
            }
            return true;
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public final String findTask(Charset charset) {
            return new String(this.resetDelta, inflateEdge(), size(), charset);
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public byte growPayload(int i) {
            return this.resetDelta[i];
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public final AbstractBucket inflateAdapter(int i, int i2) {
            int clipOrigin = AbstractBucket.clipOrigin(i, i2, size());
            return clipOrigin == 0 ? AbstractBucket.notifyMessage : new EndpointList(this.resetDelta, inflateEdge() + i, clipOrigin);
        }

        public int inflateEdge() {
            return 0;
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public final int notifyMessage(int i, int i2, int i3) {
            return ProxyTask.updateTimer(i, this.resetDelta, inflateEdge() + i2, i3);
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public byte peekRevision(int i) {
            return this.resetDelta[i];
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public final boolean serializeOffset() {
            int inflateEdge = inflateEdge();
            return MenuImpl.serializeOffset(this.resetDelta, inflateEdge, size() + inflateEdge);
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public int size() {
            return this.resetDelta.length;
        }

        @Override // com.goldenboot.saga.zone.AbstractBucket
        public final void storeCharset(SwipeBatch swipeBatch) {
            swipeBatch.evictLayout(this.resetDelta, inflateEdge(), size());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface ScopedMigration extends Iterator {
        byte nextByte();
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface StylusConverter {
        byte[] evictLayout(byte[] bArr, int i, int i2);
    }

    static {
        ActivityMutator activityMutator = null;
        connectPatch = SheetRing.injectMetric() ? new MorphDirector(activityMutator) : new LayerUseCase(activityMutator);
        attachConfig = new BounceHandler();
    }

    public static AbstractBucket applyTask(String str) {
        return new RestoreToggle(str.getBytes(ProxyTask.growPayload));
    }

    public static int clipOrigin(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static int drawScope(byte b) {
        return b & 255;
    }

    public static AbstractBucket flattenPackage(byte[] bArr) {
        return new RestoreToggle(bArr);
    }

    public static AbstractBucket flushSample(byte[] bArr) {
        return updateTimer(bArr, 0, bArr.length);
    }

    public static AbstractBucket injectConstraint(byte[] bArr, int i, int i2) {
        return new EndpointList(bArr, i, i2);
    }

    public static void releaseHeader(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public static AbstractBucket updateTimer(byte[] bArr, int i, int i2) {
        clipOrigin(i, i + i2, bArr.length);
        return new RestoreToggle(connectPatch.evictLayout(bArr, i, i2));
    }

    public final int attachConfig() {
        return this.reduceScope;
    }

    public abstract void connectJob(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    public final String expandArgs(Charset charset) {
        return size() == 0 ? "" : findTask(charset);
    }

    public abstract String findTask(Charset charset);

    public abstract byte growPayload(int i);

    public final int hashCode() {
        int i = this.reduceScope;
        if (i == 0) {
            int size = size();
            i = notifyMessage(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.reduceScope = i;
        }
        return i;
    }

    public abstract AbstractBucket inflateAdapter(int i, int i2);

    public final String mergeLocale() {
        return expandArgs(ProxyTask.growPayload);
    }

    public abstract int notifyMessage(int i, int i2, int i3);

    public abstract byte peekRevision(int i);

    public final byte[] purgeNode() {
        int size = size();
        if (size == 0) {
            return ProxyTask.detachStream;
        }
        byte[] bArr = new byte[size];
        connectJob(bArr, 0, 0, size);
        return bArr;
    }

    @Override // java.lang.Iterable
    /* renamed from: reduceScope, reason: merged with bridge method [inline-methods] */
    public ScopedMigration iterator() {
        return new ActivityMutator();
    }

    public abstract boolean serializeOffset();

    public abstract int size();

    public abstract void storeCharset(SwipeBatch swipeBatch);

    public final String syncScope() {
        if (size() <= 50) {
            return ComponentSequence.evictLayout(this);
        }
        return ComponentSequence.evictLayout(inflateAdapter(0, 47)) + "...";
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), syncScope());
    }
}
