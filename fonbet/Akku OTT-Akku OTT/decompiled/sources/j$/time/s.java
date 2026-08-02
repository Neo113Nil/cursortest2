package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public s() {
    }

    public s(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                g gVar = (g) obj;
                objectOutput.writeInt(gVar.a);
                objectOutput.writeByte(gVar.b);
                objectOutput.writeByte(gVar.c);
                return;
            case 4:
                ((k) obj).a0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                g gVar2 = localDateTime.a;
                objectOutput.writeInt(gVar2.a);
                objectOutput.writeByte(gVar2.b);
                objectOutput.writeByte(gVar2.c);
                localDateTime.b.a0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                g gVar3 = localDateTime2.a;
                objectOutput.writeInt(gVar3.a);
                objectOutput.writeByte(gVar3.b);
                objectOutput.writeByte(gVar3.c);
                localDateTime2.b.a0(objectOutput);
                zonedDateTime.b.U(objectOutput);
                zonedDateTime.c.O(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((x) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).U(objectOutput);
                return;
            case 9:
                q qVar = (q) obj;
                qVar.a.a0(objectOutput);
                qVar.b.U(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                g gVar4 = localDateTime3.a;
                objectOutput.writeInt(gVar4.a);
                objectOutput.writeByte(gVar4.b);
                objectOutput.writeByte(gVar4.c);
                localDateTime3.b.a0(objectOutput);
                offsetDateTime.b.U(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((u) obj).a);
                return;
            case 12:
                w wVar = (w) obj;
                objectOutput.writeInt(wVar.a);
                objectOutput.writeByte(wVar.b);
                return;
            case 13:
                o oVar = (o) obj;
                objectOutput.writeByte(oVar.a);
                objectOutput.writeByte(oVar.b);
                return;
            case 14:
                r rVar = (r) obj;
                objectOutput.writeInt(rVar.a);
                objectOutput.writeInt(rVar.b);
                objectOutput.writeInt(rVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    public static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.d;
                return g.U(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.V(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                g gVar2 = g.d;
                return LocalDateTime.I(g.U(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.V(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                g gVar3 = g.d;
                LocalDateTime I = LocalDateTime.I(g.U(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.V(objectInput));
                ZoneOffset T = ZoneOffset.T(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || T.equals(zoneId)) {
                    return new ZonedDateTime(I, zoneId, T);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = x.d;
                return ZoneId.v(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.T(objectInput);
            case 9:
                int i2 = q.c;
                return new q(k.V(objectInput), ZoneOffset.T(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                g gVar4 = g.d;
                return new OffsetDateTime(LocalDateTime.I(g.U(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.V(objectInput)), ZoneOffset.T(objectInput));
            case 11:
                int i4 = u.b;
                return u.o(objectInput.readInt());
            case 12:
                int i5 = w.c;
                int readInt = objectInput.readInt();
                byte readByte = objectInput.readByte();
                j$.time.temporal.a.YEAR.P(readInt);
                j$.time.temporal.a.MONTH_OF_YEAR.P(readByte);
                return new w(readInt, readByte);
            case 13:
                int i6 = o.c;
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                m I2 = m.I(readByte2);
                Objects.requireNonNull(I2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.P(readByte3);
                if (readByte3 <= I2.A()) {
                    return new o(I2.getValue(), readByte3);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) readByte3) + " is not valid for month " + I2.name());
            case 14:
                r rVar = r.d;
                return r.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
