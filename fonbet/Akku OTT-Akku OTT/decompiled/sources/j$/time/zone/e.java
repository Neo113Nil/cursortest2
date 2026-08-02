package j$.time.zone;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.WorkInfo;
import j$.time.DayOfWeek;
import j$.time.ZoneOffset;
import j$.time.k;
import j$.time.m;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final m a;
    public final byte b;
    public final DayOfWeek c;
    public final k d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(m mVar, int i, DayOfWeek dayOfWeek, k kVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = mVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = kVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int X = this.e ? 86400 : this.d.X();
        int i = this.g.b;
        int i2 = this.h.b - i;
        int i3 = this.i.b - i;
        byte b = X % 3600 == 0 ? this.e ? (byte) 24 : this.d.a : (byte) 31;
        int i4 = i % DescriptorProtos.Edition.EDITION_LEGACY_VALUE == 0 ? (i / DescriptorProtos.Edition.EDITION_LEGACY_VALUE) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / 1800 : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(X);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        k kVar;
        int i;
        int i2;
        int readInt = dataInput.readInt();
        m I = m.I(readInt >>> 28);
        int i3 = ((264241152 & readInt) >>> 22) - 32;
        int i4 = (3670016 & readInt) >>> 19;
        DayOfWeek o = i4 == 0 ? null : DayOfWeek.o(i4);
        int i5 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i6 = (readInt & 4080) >>> 4;
        int i7 = (readInt & 12) >>> 2;
        int i8 = readInt & 3;
        if (i5 == 31) {
            long readInt2 = dataInput.readInt();
            k kVar2 = k.e;
            j$.time.temporal.a.SECOND_OF_DAY.P(readInt2);
            int i9 = (int) (readInt2 / 3600);
            long j = readInt2 - (i9 * 3600);
            dVar = dVar2;
            kVar = k.v(i9, (int) (j / 60), (int) (j - (r14 * 60)), 0);
        } else {
            dVar = dVar2;
            int i10 = i5 % 24;
            k kVar3 = k.e;
            j$.time.temporal.a.HOUR_OF_DAY.P(i10);
            kVar = k.h[i10];
        }
        ZoneOffset R = ZoneOffset.R(i6 == 255 ? dataInput.readInt() : (i6 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
        if (i7 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i7 * 1800) + R.b;
        }
        ZoneOffset R2 = ZoneOffset.R(i);
        if (i8 == 3) {
            i2 = dataInput.readInt();
        } else {
            i2 = (i8 * 1800) + R.b;
        }
        ZoneOffset R3 = ZoneOffset.R(i2);
        boolean z = i5 == 24;
        Objects.requireNonNull(I, "month");
        Objects.requireNonNull(kVar, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !kVar.equals(k.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVar.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(I, i3, o, kVar, z, dVar3, R, R2, R3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int X = ((this.d.X() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (X + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
