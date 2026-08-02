package org.jose4j.json.internal.json_simple.parser;

/* loaded from: classes18.dex */
public class JSONParser {
    public static final int S_END = 6;
    public static final int S_INIT = 0;
    public static final int S_IN_ARRAY = 3;
    public static final int S_IN_ERROR = -1;
    public static final int S_IN_FINISHED_VALUE = 1;
    public static final int S_IN_OBJECT = 2;
    public static final int S_IN_PAIR_VALUE = 5;
    public static final int S_PASSED_PAIR_KEY = 4;
    private java.util.LinkedList Camera2StreamConfigurationMap;
    private org.jose4j.json.internal.json_simple.parser.Yylex getHighSpeedVideoSizes = new org.jose4j.json.internal.json_simple.parser.Yylex();
    private org.jose4j.json.internal.json_simple.parser.Yytoken getHighSpeedVideoFpsRanges = null;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;

    public void reset() {
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = null;
    }

    public void reset(java.io.Reader reader) {
        org.jose4j.json.internal.json_simple.parser.Yylex yylex = this.getHighSpeedVideoSizes;
        yylex.getInputFormats = reader;
        yylex.Camera2StreamConfigurationMap = true;
        yylex.getHighResolutionOutputSizeshNQ4ISI = false;
        yylex.getOutputSizeshNQ4ISI = 0;
        yylex.getOutputMinFrameDuration = 0;
        yylex.getInputSizeshNQ4ISI = 0;
        yylex.getHighSpeedVideoSizesFor = 0;
        yylex.getHighSpeedVideoFpsRanges = 0;
        yylex.getHighSpeedVideoFpsRangesFor = 0;
        yylex.getHighSpeedVideoSizes = 0;
        yylex.getOutputFormats = 0;
        reset();
    }

    public int getPosition() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.Object parse(java.lang.String str) throws org.jose4j.json.internal.json_simple.parser.ParseException {
        return parse(str, (org.jose4j.json.internal.json_simple.parser.ContainerFactory) null);
    }

    public java.lang.Object parse(java.lang.String str, org.jose4j.json.internal.json_simple.parser.ContainerFactory containerFactory) throws org.jose4j.json.internal.json_simple.parser.ParseException {
        try {
            return parse(new java.io.StringReader(str), containerFactory);
        } catch (java.io.IOException e) {
            throw new org.jose4j.json.internal.json_simple.parser.ParseException(-1, 2, e);
        }
    }

    public java.lang.Object parse(java.io.Reader reader) throws java.io.IOException, org.jose4j.json.internal.json_simple.parser.ParseException {
        return parse(reader, (org.jose4j.json.internal.json_simple.parser.ContainerFactory) null);
    }

    public java.lang.Object parse(java.io.Reader reader, org.jose4j.json.internal.json_simple.parser.ContainerFactory containerFactory) throws java.io.IOException, org.jose4j.json.internal.json_simple.parser.ParseException {
        reset(reader);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        do {
            org.jose4j.json.internal.json_simple.parser.Yytoken highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
            if (highSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRanges = new org.jose4j.json.internal.json_simple.parser.Yytoken(-1, null);
            }
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == -1) {
                throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
            }
            if (i == 0) {
                int i2 = this.getHighSpeedVideoFpsRanges.type;
                if (i2 == 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    linkedList.addFirst(1);
                    linkedList2.addFirst(this.getHighSpeedVideoFpsRanges.value);
                } else if (i2 == 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    linkedList.addFirst(2);
                    linkedList2.addFirst(getHighSpeedVideoSizes(containerFactory));
                } else if (i2 == 3) {
                    this.getHighResolutionOutputSizeshNQ4ISI = 3;
                    linkedList.addFirst(3);
                    linkedList2.addFirst(getHighSpeedVideoFpsRangesFor(containerFactory));
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = -1;
                }
            } else {
                if (i == 1) {
                    if (this.getHighSpeedVideoFpsRanges.type == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
                }
                if (i == 2) {
                    int i3 = this.getHighSpeedVideoFpsRanges.type;
                    if (i3 != 0) {
                        if (i3 != 2) {
                            if (i3 != 5) {
                                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                            }
                        } else if (linkedList2.size() > 1) {
                            linkedList.removeFirst();
                            linkedList2.removeFirst();
                            this.getHighResolutionOutputSizeshNQ4ISI = linkedList.size() == 0 ? -1 : ((java.lang.Integer) linkedList.getFirst()).intValue();
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        }
                    } else if (this.getHighSpeedVideoFpsRanges.value instanceof java.lang.String) {
                        linkedList2.addFirst((java.lang.String) this.getHighSpeedVideoFpsRanges.value);
                        this.getHighResolutionOutputSizeshNQ4ISI = 4;
                        linkedList.addFirst(4);
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = -1;
                    }
                } else if (i == 3) {
                    int i4 = this.getHighSpeedVideoFpsRanges.type;
                    if (i4 == 0) {
                        ((java.util.List) linkedList2.getFirst()).add(this.getHighSpeedVideoFpsRanges.value);
                    } else if (i4 == 1) {
                        java.util.List list = (java.util.List) linkedList2.getFirst();
                        java.util.Map highSpeedVideoSizes = getHighSpeedVideoSizes(containerFactory);
                        list.add(highSpeedVideoSizes);
                        this.getHighResolutionOutputSizeshNQ4ISI = 2;
                        linkedList.addFirst(2);
                        linkedList2.addFirst(highSpeedVideoSizes);
                    } else if (i4 == 3) {
                        java.util.List list2 = (java.util.List) linkedList2.getFirst();
                        java.util.List highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(containerFactory);
                        list2.add(highSpeedVideoFpsRangesFor2);
                        this.getHighResolutionOutputSizeshNQ4ISI = 3;
                        linkedList.addFirst(3);
                        linkedList2.addFirst(highSpeedVideoFpsRangesFor2);
                    } else if (i4 != 4) {
                        if (i4 != 5) {
                            this.getHighResolutionOutputSizeshNQ4ISI = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.getHighResolutionOutputSizeshNQ4ISI = linkedList.size() == 0 ? -1 : ((java.lang.Integer) linkedList.getFirst()).intValue();
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    }
                } else if (i == 4) {
                    int i5 = this.getHighSpeedVideoFpsRanges.type;
                    if (i5 == 0) {
                        linkedList.removeFirst();
                        ((java.util.Map) linkedList2.getFirst()).put((java.lang.String) linkedList2.removeFirst(), this.getHighSpeedVideoFpsRanges.value);
                        this.getHighResolutionOutputSizeshNQ4ISI = linkedList.size() == 0 ? -1 : ((java.lang.Integer) linkedList.getFirst()).intValue();
                    } else if (i5 == 1) {
                        linkedList.removeFirst();
                        java.lang.String str = (java.lang.String) linkedList2.removeFirst();
                        java.util.Map map = (java.util.Map) linkedList2.getFirst();
                        java.util.Map highSpeedVideoSizes2 = getHighSpeedVideoSizes(containerFactory);
                        map.put(str, highSpeedVideoSizes2);
                        this.getHighResolutionOutputSizeshNQ4ISI = 2;
                        linkedList.addFirst(2);
                        linkedList2.addFirst(highSpeedVideoSizes2);
                    } else if (i5 == 3) {
                        linkedList.removeFirst();
                        java.lang.String str2 = (java.lang.String) linkedList2.removeFirst();
                        java.util.Map map2 = (java.util.Map) linkedList2.getFirst();
                        java.util.List highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(containerFactory);
                        map2.put(str2, highSpeedVideoFpsRangesFor3);
                        this.getHighResolutionOutputSizeshNQ4ISI = 3;
                        linkedList.addFirst(3);
                        linkedList2.addFirst(highSpeedVideoFpsRangesFor3);
                    } else if (i5 != 6) {
                        this.getHighResolutionOutputSizeshNQ4ISI = -1;
                    }
                }
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
            }
        } while (this.getHighSpeedVideoFpsRanges.type != -1);
        throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
    }

    private static java.util.Map getHighSpeedVideoSizes(org.jose4j.json.internal.json_simple.parser.ContainerFactory containerFactory) {
        if (containerFactory == null) {
            return new org.jose4j.json.internal.json_simple.JSONObject();
        }
        java.util.Map createObjectContainer = containerFactory.createObjectContainer();
        return createObjectContainer == null ? new org.jose4j.json.internal.json_simple.JSONObject() : createObjectContainer;
    }

    private static java.util.List getHighSpeedVideoFpsRangesFor(org.jose4j.json.internal.json_simple.parser.ContainerFactory containerFactory) {
        if (containerFactory == null) {
            return new org.jose4j.json.internal.json_simple.JSONArray();
        }
        java.util.List creatArrayContainer = containerFactory.creatArrayContainer();
        return creatArrayContainer == null ? new org.jose4j.json.internal.json_simple.JSONArray() : creatArrayContainer;
    }

    public void parse(java.lang.String str, org.jose4j.json.internal.json_simple.parser.ContentHandler contentHandler) throws org.jose4j.json.internal.json_simple.parser.ParseException {
        parse(str, contentHandler, false);
    }

    public void parse(java.lang.String str, org.jose4j.json.internal.json_simple.parser.ContentHandler contentHandler, boolean z) throws org.jose4j.json.internal.json_simple.parser.ParseException {
        try {
            parse(new java.io.StringReader(str), contentHandler, z);
        } catch (java.io.IOException e) {
            throw new org.jose4j.json.internal.json_simple.parser.ParseException(-1, 2, e);
        }
    }

    public void parse(java.io.Reader reader, org.jose4j.json.internal.json_simple.parser.ContentHandler contentHandler) throws java.io.IOException, org.jose4j.json.internal.json_simple.parser.ParseException {
        parse(reader, contentHandler, false);
    }

    public void parse(java.io.Reader reader, org.jose4j.json.internal.json_simple.parser.ContentHandler contentHandler, boolean z) throws java.io.IOException, org.jose4j.json.internal.json_simple.parser.ParseException {
        if (!z) {
            reset(reader);
            this.Camera2StreamConfigurationMap = new java.util.LinkedList();
        } else if (this.Camera2StreamConfigurationMap == null) {
            reset(reader);
            this.Camera2StreamConfigurationMap = new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = this.Camera2StreamConfigurationMap;
        do {
            try {
                switch (this.getHighResolutionOutputSizeshNQ4ISI) {
                    case -1:
                        throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
                    case 0:
                        contentHandler.startJSON();
                        org.jose4j.json.internal.json_simple.parser.Yytoken highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
                        if (highSpeedVideoFpsRangesFor == null) {
                            this.getHighSpeedVideoFpsRanges = new org.jose4j.json.internal.json_simple.parser.Yytoken(-1, null);
                        }
                        int i = this.getHighSpeedVideoFpsRanges.type;
                        if (i == 0) {
                            this.getHighResolutionOutputSizeshNQ4ISI = 1;
                            linkedList.addFirst(new java.lang.Integer(1));
                            if (!contentHandler.primitive(this.getHighSpeedVideoFpsRanges.value)) {
                                return;
                            }
                        } else if (i == 1) {
                            this.getHighResolutionOutputSizeshNQ4ISI = 2;
                            linkedList.addFirst(new java.lang.Integer(2));
                            if (!contentHandler.startObject()) {
                                return;
                            }
                        } else if (i == 3) {
                            this.getHighResolutionOutputSizeshNQ4ISI = 3;
                            linkedList.addFirst(new java.lang.Integer(3));
                            if (!contentHandler.startArray()) {
                                return;
                            }
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI = -1;
                            break;
                        }
                        break;
                    case 1:
                        org.jose4j.json.internal.json_simple.parser.Yytoken highSpeedVideoFpsRangesFor2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor2;
                        if (highSpeedVideoFpsRangesFor2 == null) {
                            this.getHighSpeedVideoFpsRanges = new org.jose4j.json.internal.json_simple.parser.Yytoken(-1, null);
                        }
                        if (this.getHighSpeedVideoFpsRanges.type == -1) {
                            contentHandler.endJSON();
                            this.getHighResolutionOutputSizeshNQ4ISI = 6;
                            return;
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI = -1;
                            throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
                        }
                    case 2:
                        org.jose4j.json.internal.json_simple.parser.Yytoken highSpeedVideoFpsRangesFor3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor3;
                        if (highSpeedVideoFpsRangesFor3 == null) {
                            this.getHighSpeedVideoFpsRanges = new org.jose4j.json.internal.json_simple.parser.Yytoken(-1, null);
                        }
                        int i2 = this.getHighSpeedVideoFpsRanges.type;
                        if (i2 == 0) {
                            if (this.getHighSpeedVideoFpsRanges.value instanceof java.lang.String) {
                                java.lang.String str = (java.lang.String) this.getHighSpeedVideoFpsRanges.value;
                                this.getHighResolutionOutputSizeshNQ4ISI = 4;
                                linkedList.addFirst(new java.lang.Integer(4));
                                if (!contentHandler.startObjectEntry(str)) {
                                    return;
                                }
                            } else {
                                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                                break;
                            }
                        } else if (i2 == 2) {
                            if (linkedList.size() > 1) {
                                linkedList.removeFirst();
                                this.getHighResolutionOutputSizeshNQ4ISI = linkedList.size() == 0 ? -1 : ((java.lang.Integer) linkedList.getFirst()).intValue();
                            } else {
                                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                            }
                            if (!contentHandler.endObject()) {
                                return;
                            }
                        } else if (i2 != 5) {
                            this.getHighResolutionOutputSizeshNQ4ISI = -1;
                            break;
                        }
                        break;
                    case 3:
                        org.jose4j.json.internal.json_simple.parser.Yytoken highSpeedVideoFpsRangesFor4 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor4;
                        if (highSpeedVideoFpsRangesFor4 == null) {
                            this.getHighSpeedVideoFpsRanges = new org.jose4j.json.internal.json_simple.parser.Yytoken(-1, null);
                        }
                        int i3 = this.getHighSpeedVideoFpsRanges.type;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                                linkedList.addFirst(new java.lang.Integer(2));
                                if (!contentHandler.startObject()) {
                                    return;
                                }
                            } else if (i3 == 3) {
                                this.getHighResolutionOutputSizeshNQ4ISI = 3;
                                linkedList.addFirst(new java.lang.Integer(3));
                                if (!contentHandler.startArray()) {
                                    return;
                                }
                            } else if (i3 == 4) {
                                if (linkedList.size() > 1) {
                                    linkedList.removeFirst();
                                    this.getHighResolutionOutputSizeshNQ4ISI = linkedList.size() == 0 ? -1 : ((java.lang.Integer) linkedList.getFirst()).intValue();
                                } else {
                                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                                }
                                if (!contentHandler.endArray()) {
                                    return;
                                }
                            } else if (i3 != 5) {
                                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                                break;
                            }
                        } else if (!contentHandler.primitive(this.getHighSpeedVideoFpsRanges.value)) {
                            return;
                        }
                        break;
                    case 4:
                        org.jose4j.json.internal.json_simple.parser.Yytoken highSpeedVideoFpsRangesFor5 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor5;
                        if (highSpeedVideoFpsRangesFor5 == null) {
                            this.getHighSpeedVideoFpsRanges = new org.jose4j.json.internal.json_simple.parser.Yytoken(-1, null);
                        }
                        int i4 = this.getHighSpeedVideoFpsRanges.type;
                        if (i4 == 0) {
                            linkedList.removeFirst();
                            this.getHighResolutionOutputSizeshNQ4ISI = linkedList.size() == 0 ? -1 : ((java.lang.Integer) linkedList.getFirst()).intValue();
                            if (!contentHandler.primitive(this.getHighSpeedVideoFpsRanges.value) || !contentHandler.endObjectEntry()) {
                                return;
                            }
                        } else if (i4 == 1) {
                            linkedList.removeFirst();
                            linkedList.addFirst(new java.lang.Integer(5));
                            this.getHighResolutionOutputSizeshNQ4ISI = 2;
                            linkedList.addFirst(new java.lang.Integer(2));
                            if (!contentHandler.startObject()) {
                                return;
                            }
                        } else if (i4 == 3) {
                            linkedList.removeFirst();
                            linkedList.addFirst(new java.lang.Integer(5));
                            this.getHighResolutionOutputSizeshNQ4ISI = 3;
                            linkedList.addFirst(new java.lang.Integer(3));
                            if (!contentHandler.startArray()) {
                                return;
                            }
                        } else if (i4 != 6) {
                            this.getHighResolutionOutputSizeshNQ4ISI = -1;
                            break;
                        }
                        break;
                    case 5:
                        linkedList.removeFirst();
                        this.getHighResolutionOutputSizeshNQ4ISI = linkedList.size() == 0 ? -1 : ((java.lang.Integer) linkedList.getFirst()).intValue();
                        if (!contentHandler.endObjectEntry()) {
                            return;
                        }
                        break;
                    case 6:
                        return;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                    throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
                }
            } catch (java.io.IOException e) {
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                throw e;
            } catch (java.lang.Error e2) {
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                throw e2;
            } catch (java.lang.RuntimeException e3) {
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                throw e3;
            } catch (org.jose4j.json.internal.json_simple.parser.ParseException e4) {
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                throw e4;
            }
        } while (this.getHighSpeedVideoFpsRanges.type != -1);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        throw new org.jose4j.json.internal.json_simple.parser.ParseException(getPosition(), 1, this.getHighSpeedVideoFpsRanges);
    }
}
