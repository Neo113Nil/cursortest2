package org.slf4j.helpers;

/* loaded from: classes18.dex */
abstract class NamedLoggerBase implements org.slf4j.Logger, java.io.Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    /* renamed from: name, reason: collision with root package name */
    protected java.lang.String f7057name;

    NamedLoggerBase() {
    }

    @Override // org.slf4j.Logger
    public java.lang.String getName() {
        return this.f7057name;
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return org.slf4j.LoggerFactory.getLogger(getName());
    }
}
