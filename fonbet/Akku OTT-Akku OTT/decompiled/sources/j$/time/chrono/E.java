package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class E implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public E() {
    }

    public E(byte b, Object obj) {
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
                objectOutput.writeUTF(((AbstractC1034a) obj).m());
                return;
            case 2:
                C1040g c1040g = (C1040g) obj;
                objectOutput.writeObject(c1040g.a);
                objectOutput.writeObject(c1040g.b);
                return;
            case 3:
                k kVar = (k) obj;
                objectOutput.writeObject(kVar.a);
                objectOutput.writeObject(kVar.b);
                objectOutput.writeObject(kVar.c);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(xVar.f(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(xVar.f(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(xVar.f(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((y) obj).a);
                return;
            case 6:
                q qVar = (q) obj;
                objectOutput.writeObject(qVar.a);
                objectOutput.writeInt(qVar.f(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(qVar.f(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(qVar.f(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                C c = (C) obj;
                c.getClass();
                objectOutput.writeInt(c.f(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(c.f(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(c.f(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                I i = (I) obj;
                i.getClass();
                objectOutput.writeInt(i.f(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(i.f(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(i.f(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                C1041h c1041h = (C1041h) obj;
                objectOutput.writeUTF(c1041h.a.m());
                objectOutput.writeInt(c1041h.b);
                objectOutput.writeInt(c1041h.c);
                objectOutput.writeInt(c1041h.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object of;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC1034a.a;
                of = l.of(objectInput.readUTF());
                break;
            case 2:
                of = ((InterfaceC1035b) objectInput.readObject()).E((j$.time.k) objectInput.readObject());
                break;
            case 3:
                of = ((InterfaceC1038e) objectInput.readObject()).z((ZoneOffset) objectInput.readObject()).y((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.g gVar = x.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                v.c.getClass();
                of = new x(j$.time.g.U(readInt, readByte2, readByte3));
                break;
            case 5:
                y yVar = y.d;
                of = y.n(objectInput.readByte());
                break;
            case 6:
                o oVar = (o) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                oVar.getClass();
                of = new q(oVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                A.c.getClass();
                of = new C(j$.time.g.U(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                G.c.getClass();
                of = new I(j$.time.g.U(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i = C1041h.e;
                of = new C1041h(l.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = of;
    }

    private Object readResolve() {
        return this.b;
    }
}
