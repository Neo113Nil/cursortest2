package M8;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class f implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    private boolean f17640d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17643g;

    /* renamed from: a, reason: collision with root package name */
    private String f17637a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f17638b = "";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f17639c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private String f17641e = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f17642f = false;

    /* renamed from: h, reason: collision with root package name */
    private String f17644h = "";

    public final String a() {
        return this.f17638b;
    }

    public final String b(int i11) {
        return (String) this.f17639c.get(i11);
    }

    public final int d() {
        return this.f17639c.size();
    }

    public final String e() {
        return this.f17641e;
    }

    public final boolean f() {
        return this.f17642f;
    }

    public final String g() {
        return this.f17637a;
    }

    public final boolean h() {
        return this.f17643g;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.f17637a = objectInput.readUTF();
        this.f17638b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f17639c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f17640d = true;
            this.f17641e = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f17643g = true;
            this.f17644h = readUTF2;
        }
        this.f17642f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f17637a);
        objectOutput.writeUTF(this.f17638b);
        int size = this.f17639c.size();
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            objectOutput.writeUTF((String) this.f17639c.get(i11));
        }
        objectOutput.writeBoolean(this.f17640d);
        if (this.f17640d) {
            objectOutput.writeUTF(this.f17641e);
        }
        objectOutput.writeBoolean(this.f17643g);
        if (this.f17643g) {
            objectOutput.writeUTF(this.f17644h);
        }
        objectOutput.writeBoolean(this.f17642f);
    }
}
