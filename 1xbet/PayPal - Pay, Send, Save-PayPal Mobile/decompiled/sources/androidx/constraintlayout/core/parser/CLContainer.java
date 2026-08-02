package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLContainer extends androidx.constraintlayout.core.parser.CLElement {
    java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> getHighSpeedVideoFpsRangesFor;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLContainer(cArr);
    }

    public void add(androidx.constraintlayout.core.parser.CLElement cLElement) {
        this.getHighSpeedVideoFpsRangesFor.add(cLElement);
        if (androidx.constraintlayout.core.parser.CLParser.getHighSpeedVideoSizes) {
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("added element ");
            sb.append(cLElement);
            sb.append(" to ");
            sb.append(this);
            printStream.println(sb.toString());
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLElement next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(super.toString());
        sb2.append(" = <");
        sb2.append((java.lang.Object) sb);
        sb2.append(" >");
        return sb2.toString();
    }

    public int size() {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    public java.util.ArrayList<java.lang.String> names() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLElement next = it.next();
            if (next instanceof androidx.constraintlayout.core.parser.CLKey) {
                arrayList.add(((androidx.constraintlayout.core.parser.CLKey) next).content());
            }
        }
        return arrayList;
    }

    public boolean has(java.lang.String str) {
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLElement next = it.next();
            if ((next instanceof androidx.constraintlayout.core.parser.CLKey) && ((androidx.constraintlayout.core.parser.CLKey) next).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void put(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) {
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) it.next();
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.getHighSpeedVideoFpsRangesFor.add((androidx.constraintlayout.core.parser.CLKey) androidx.constraintlayout.core.parser.CLKey.allocate(str, cLElement));
    }

    public void putNumber(java.lang.String str, float f) {
        put(str, new androidx.constraintlayout.core.parser.CLNumber(f));
    }

    public void putString(java.lang.String str, java.lang.String str2) {
        androidx.constraintlayout.core.parser.CLString cLString = new androidx.constraintlayout.core.parser.CLString(str2.toCharArray());
        cLString.setStart(0L);
        cLString.setEnd(str2.length() - 1);
        put(str, cLString);
    }

    public void remove(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLElement next = it.next();
            if (((androidx.constraintlayout.core.parser.CLKey) next).content().equals(str)) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.getHighSpeedVideoFpsRangesFor.remove((androidx.constraintlayout.core.parser.CLElement) it2.next());
        }
    }

    public void clear() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    public androidx.constraintlayout.core.parser.CLElement get(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("no element for key <");
        sb.append(str);
        sb.append(">");
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public int getInt(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("no int found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(cLElement.getStrClass());
        sb.append("] : ");
        sb.append(cLElement);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public float getFloat(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("no float found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(cLElement.getStrClass());
        sb.append("] : ");
        sb.append(cLElement);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public androidx.constraintlayout.core.parser.CLArray getArray(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLArray) {
            return (androidx.constraintlayout.core.parser.CLArray) cLElement;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("no array found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(cLElement.getStrClass());
        sb.append("] : ");
        sb.append(cLElement);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public androidx.constraintlayout.core.parser.CLObject getObject(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
            return (androidx.constraintlayout.core.parser.CLObject) cLElement;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("no object found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(cLElement.getStrClass());
        sb.append("] : ");
        sb.append(cLElement);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public java.lang.String getString(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
            return cLElement.content();
        }
        java.lang.String strClass = cLElement != null ? cLElement.getStrClass() : null;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("no string found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(strClass);
        sb.append("] : ");
        sb.append(cLElement);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public boolean getBoolean(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLToken) {
            return ((androidx.constraintlayout.core.parser.CLToken) cLElement).getBoolean();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("no boolean found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(cLElement.getStrClass());
        sb.append("] : ");
        sb.append(cLElement);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public androidx.constraintlayout.core.parser.CLElement getOrNull(java.lang.String str) {
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public androidx.constraintlayout.core.parser.CLObject getObjectOrNull(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLObject) {
            return (androidx.constraintlayout.core.parser.CLObject) orNull;
        }
        return null;
    }

    public androidx.constraintlayout.core.parser.CLArray getArrayOrNull(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLArray) {
            return (androidx.constraintlayout.core.parser.CLArray) orNull;
        }
        return null;
    }

    public androidx.constraintlayout.core.parser.CLArray getArrayOrCreate(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLArray arrayOrNull = getArrayOrNull(str);
        if (arrayOrNull != null) {
            return arrayOrNull;
        }
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        put(str, cLArray);
        return cLArray;
    }

    public java.lang.String getStringOrNull(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLString) {
            return orNull.content();
        }
        return null;
    }

    public float getFloatOrNaN(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public androidx.constraintlayout.core.parser.CLElement get(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        if (i >= 0 && i < this.getHighSpeedVideoFpsRangesFor.size()) {
            return this.getHighSpeedVideoFpsRangesFor.get(i);
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no element at index ".concat(java.lang.String.valueOf(i)), this);
    }

    public int getInt(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no int at index ".concat(java.lang.String.valueOf(i)), this);
    }

    public float getFloat(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no float at index ".concat(java.lang.String.valueOf(i)), this);
    }

    public androidx.constraintlayout.core.parser.CLArray getArray(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLArray) {
            return (androidx.constraintlayout.core.parser.CLArray) cLElement;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no array at index ".concat(java.lang.String.valueOf(i)), this);
    }

    public androidx.constraintlayout.core.parser.CLObject getObject(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
            return (androidx.constraintlayout.core.parser.CLObject) cLElement;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no object at index ".concat(java.lang.String.valueOf(i)), this);
    }

    public java.lang.String getString(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
            return cLElement.content();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no string at index ".concat(java.lang.String.valueOf(i)), this);
    }

    public boolean getBoolean(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLToken) {
            return ((androidx.constraintlayout.core.parser.CLToken) cLElement).getBoolean();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no boolean at index ".concat(java.lang.String.valueOf(i)), this);
    }

    public androidx.constraintlayout.core.parser.CLElement getOrNull(int i) {
        if (i < 0 || i >= this.getHighSpeedVideoFpsRangesFor.size()) {
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor.get(i);
    }

    public java.lang.String getStringOrNull(int i) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(i);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLString) {
            return orNull.content();
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.constraintlayout.core.parser.CLContainer mo9053clone() {
        androidx.constraintlayout.core.parser.CLContainer cLContainer = (androidx.constraintlayout.core.parser.CLContainer) super.mo9053clone();
        java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> arrayList = new java.util.ArrayList<>(this.getHighSpeedVideoFpsRangesFor.size());
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLElement mo9053clone = it.next().mo9053clone();
            mo9053clone.setContainer(cLContainer);
            arrayList.add(mo9053clone);
        }
        cLContainer.getHighSpeedVideoFpsRangesFor = arrayList;
        return cLContainer;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.constraintlayout.core.parser.CLContainer) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((androidx.constraintlayout.core.parser.CLContainer) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return java.util.Objects.hash(this.getHighSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(super.hashCode()));
    }
}
