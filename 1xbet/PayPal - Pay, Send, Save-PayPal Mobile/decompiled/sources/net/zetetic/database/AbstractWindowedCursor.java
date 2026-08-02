package net.zetetic.database;

/* loaded from: classes5.dex */
public abstract class AbstractWindowedCursor extends net.zetetic.database.AbstractCursor {
    protected net.zetetic.database.CursorWindow mWindow;

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i) {
        checkPosition();
        return this.mWindow.getBlob(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int i) {
        checkPosition();
        return this.mWindow.getString(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public void copyStringToBuffer(int i, android.database.CharArrayBuffer charArrayBuffer) {
        this.mWindow.copyStringToBuffer(this.mPos, i, charArrayBuffer);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public short getShort(int i) {
        checkPosition();
        return this.mWindow.getShort(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getInt(int i) {
        checkPosition();
        return this.mWindow.getInt(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public long getLong(int i) {
        checkPosition();
        return this.mWindow.getLong(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i) {
        checkPosition();
        return this.mWindow.getFloat(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i) {
        checkPosition();
        return this.mWindow.getDouble(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i) {
        return this.mWindow.getType(this.mPos, i) == 0;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getType(int i) {
        return this.mWindow.getType(this.mPos, i);
    }

    @Override // net.zetetic.database.AbstractCursor
    protected void checkPosition() {
        super.checkPosition();
        if (this.mWindow == null) {
            throw new android.database.StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    public net.zetetic.database.CursorWindow getWindow() {
        return this.mWindow;
    }

    public void setWindow(net.zetetic.database.CursorWindow cursorWindow) {
        if (cursorWindow != this.mWindow) {
            closeWindow();
            this.mWindow = cursorWindow;
        }
    }

    public boolean hasWindow() {
        return this.mWindow != null;
    }

    protected void closeWindow() {
        net.zetetic.database.CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    protected void clearOrCreateWindow(java.lang.String str) {
        net.zetetic.database.CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow == null) {
            this.mWindow = new net.zetetic.database.CursorWindow(str);
        } else {
            cursorWindow.clear();
        }
    }

    @Override // net.zetetic.database.AbstractCursor
    protected void onDeactivateOrClose() {
        super.onDeactivateOrClose();
        closeWindow();
    }
}
